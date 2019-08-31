package MultiThreading.Concurrent;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {

	public static void main(String[] args) {
		Semaphore sem = new Semaphore(1);
		
		// invoke 2 threads
        new Thread(new IncResource(sem, "A")).start();
        new Thread(new DecResource(sem, "B")).start();
	}
}

class SharedResource {
	static int count = 0;
}

class IncResource implements Runnable {
	String name;
	Semaphore sem;
	
	public IncResource(Semaphore s, String str) {
		sem = s;
		name = str;
	}
	
	public void run() {
		System.out.println("Staring thread: " + name);
		try {
			System.out.println(name + " waiting to take a permit ");
			sem.acquire();
			for (int i = 0; i<5; i++) {
				SharedResource.count++;
				System.out.println(name + ": " + SharedResource.count);
				Thread.sleep(10);
			}
		}
		catch (InterruptedException ex) {
			System.out.println(ex);
		}
		
		System.out.println(name + " releasing the permit");
		sem.release();
	}
}

class DecResource implements Runnable {
	Semaphore sem;
	String name;
	
	public DecResource(Semaphore s, String str) {
		sem = s;
		name = str;
	}
	
	public void run() {
		System.out.println("Starting thread: " + name);
		
		try {
			System.out.println(name + " waiting to acquire semaphore");
			sem.acquire();
			for (int i = 5; i >0; i--) {
				SharedResource.count--;
				System.out.println(name + ": " + SharedResource.count);
				Thread.sleep(10);
			}
			System.out.println(name + " releasing Semaphore");
			sem.release();
		}
		catch (InterruptedException ex) {
			System.out.println(ex);
		}
	}
}