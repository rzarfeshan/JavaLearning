package MultiThreading;

class NewThread extends Thread {
	Thread t;
	NewThread(String name) {
		super(name);
//		t = new Thread(this, "NewThread");
		System.out.println("Child thread created - " +this);
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
		System.out.println("Exiting Child thread" + this);
	}
}
public class ThreadDemoThreadClass {

	public static void main(String[] args) {
		NewThread nt1 = new NewThread("One");
		NewThread nt2 = new NewThread("Two");
		NewThread nt3 = new NewThread("Three");
		nt1.start();
		nt2.start();
		nt3.start();
		
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
