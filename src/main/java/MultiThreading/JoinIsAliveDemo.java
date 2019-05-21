package MultiThreading;

public class JoinIsAliveDemo {

	public static void main(String[] args) {
		NewThreadRunnable nt1 = new NewThreadRunnable("One");
		NewThreadRunnable nt2 = new NewThreadRunnable("Two");
		NewThreadRunnable nt3 = new NewThreadRunnable("Three");
		
		nt1.t.start();
		nt2.t.start();
		nt3.t.start();
		
		System.out.println("Thread One isAlive - " + nt1.t.isAlive());
		System.out.println("Thread Two isAlive - " + nt2.t.isAlive());
		System.out.println("Thread Three isAlive - " + nt3.t.isAlive());
		
		// Wait for thread to finish
		try {
			System.out.println("Waiting for threads to finish");
			nt1.t.join();
			nt2.t.join();
			nt3.t.join();			
		}
		catch(InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
		
		System.out.println("Thread One isAlive - " + nt1.t.isAlive());
		System.out.println("Thread Two isAlive - " + nt2.t.isAlive());
		System.out.println("Thread Three isAlive - " + nt3.t.isAlive());
		
		System.out.println("Main thread exiting");
	}

}
