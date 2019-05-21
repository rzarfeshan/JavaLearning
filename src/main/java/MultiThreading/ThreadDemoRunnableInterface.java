package MultiThreading;

class NewThreadRunnable implements Runnable {
	Thread t;
	String name;
	NewThreadRunnable(String threadName) {
		name = threadName;
		t = new Thread(this, threadName);
		System.out.println("Child thread created - " + t);
	}
	
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(name + ": " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("InterruptedException handled");
		}
		System.out.println(name + " exiting");
	}
}

public class ThreadDemoRunnableInterface {
	public static void main(String[] args) {
		NewThreadRunnable nt1 = new NewThreadRunnable("One");
		NewThreadRunnable nt2 = new NewThreadRunnable("Two");
		NewThreadRunnable nt3 = new NewThreadRunnable("Three");
		nt1.t.start();
		nt2.t.start();
		nt3.t.start();
		
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Main thread - " +i);
				Thread.sleep(1000);	
			}
		}
		catch(InterruptedException e) {
			System.out.println("Main Caught InterruptedException");
		}
		System.out.println("Main thread exiting");

	}

}
