package MultiThreading;

class NewThread implements Runnable {
	Thread t;
	NewThread() {
		t = new Thread(this, "NewThread");
		System.out.println("Child thread created - " +t);
	}
	
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Child Thread - " +i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("InterruptedException handled");
		}
		System.out.println("Exiting Child thread" + t);
	}
}
public class ThreadDemoThreadClass {

	public static void main(String[] args) {
		NewThread nt = new NewThread();
		nt.t.start();
		
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
