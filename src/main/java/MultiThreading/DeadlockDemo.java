package MultiThreading;
class A {
	synchronized void foo(B b) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " entered A.foo");
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			System.out.println("Exception Interrupted");
		}
		System.out.println(name + " trying to call B.last()");
		b.last();
	}
	
	synchronized void last( ) {
		System.out.println("Inside A.last()");
	}
}

class B {
	synchronized void bar(A a) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " entered B.bar");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Exception Interrupted");
		}
		System.out.println(name + " trying to call A.last");
		a.last();
	}
	
	synchronized void last() {
		System.out.println("Inside B.last()");
	}
}

class Deadlock implements Runnable {
	A a = new A();
	B b = new B();
	Thread t;
	
	Deadlock() {
		Thread.currentThread().setName("MainThread");
		t = new Thread(this, "RacingThread");
	}
	
	void deadlockStart() {
		t.start();
		a.foo(b);
		System.out.println("Back in mainThread");
	}
	
	public void run() {
		b.bar(a);
		System.out.println("Back in other thread");
	}
	
}
public class DeadlockDemo {
	public static void main(String[] args) {
		Deadlock d = new Deadlock();
		d.deadlockStart();
	}

}
