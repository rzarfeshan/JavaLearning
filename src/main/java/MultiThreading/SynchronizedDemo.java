package MultiThreading;

class CallMe {
	// synchronized void call(String msg) { // Using synchronized method, uncomment it.
	void call(String msg) { // Using synchronized block/statement.
		System.out.print("[" + msg);
		try {
			Thread.sleep(1000);	
		}catch (InterruptedException e) {
			System.out.println("Caught Exception");
		}
		System.out.println("]");
	}
}

class Caller implements Runnable {
	Thread t;
	String msg;
	CallMe target;
	
	Caller(CallMe callMeObj, String strMsg) {
		target = callMeObj;
		msg = strMsg;
		t = new Thread(this);
	}
	public void run() {
		synchronized (target) { // Using synchronized block/statement. Comment it to use synchronized method.
			target.call(msg);
		}
	}
}

public class SynchronizedDemo {
	public static void main(String[] args) {
		CallMe me = new CallMe();
		Caller thrObj1 = new Caller(me, "Hello");
		Caller thrObj2 = new Caller(me, "Synchronized");
		Caller thrObj3 = new Caller(me, "World");
		
		thrObj1.t.start();
		thrObj2.t.start();
		thrObj3.t.start();
		
		try {
			thrObj1.t.join();
			thrObj2.t.join();
			thrObj3.t.join();	
		} catch(InterruptedException e) {
			System.out.println("Caught InterruptedException");
		}
		
	}

}
