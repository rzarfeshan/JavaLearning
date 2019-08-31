package MultiThreading.Concurrent;

import java.util.concurrent.locks.ReentrantLock;

class LockThread implements Runnable {
	ReentrantLock myLock;
	String myName;
	
	LockThread(ReentrantLock lck, String name) {
		myLock = lck;
		myName = name;
	}
	
	public void run() {
		System.out.println("Starting: " + myName);
		try {
			System.out.println(myName + " waiting to take lock");
			myLock.lock();
			System.out.println(myName + "taking lock");
			SharedRes.i++;
			System.out.println(myName + " is sleeping");
			Thread.sleep(10000);
		}
		catch (InterruptedException e) {
			System.out.println(e);
		}
		finally {
			System.out.println(myName + " is Unlocking");
			myLock.unlock();
		}
	}
}

class SharedRes {
	static int i = 10;
}
public class LockDemo {
	public static void main(String[] args) {
		ReentrantLock lckObj = new ReentrantLock();
		new Thread(new LockThread(lckObj, "A")).start();
		new Thread(new LockThread(lckObj, "B")).start();
	}

}
