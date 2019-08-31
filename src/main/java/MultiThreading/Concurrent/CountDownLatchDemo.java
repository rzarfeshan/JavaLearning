package MultiThreading.Concurrent;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
	public static void main(String[] args) {
		CountDownLatch cdl = new CountDownLatch(5);
		
		new Thread(new MyEvent(cdl), "Event").start();
		
		try {
			cdl.await();
		}
		catch (InterruptedException e)
		{
			System.out.println(e);
		}
		
		System.out.println("Main Done");
	}
}

class MyEvent implements Runnable {
	CountDownLatch c;
	public MyEvent(CountDownLatch c) {
		this.c = c;
	}
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			c.countDown();
			System.out.println("Decrementing Latch");
		}
	}
}