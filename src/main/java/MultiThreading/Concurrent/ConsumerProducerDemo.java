package MultiThreading.Concurrent;

import java.util.concurrent.Semaphore;

class Q {
	int n;
	static Semaphore semConsumer = new Semaphore(0);
	static Semaphore semProducer = new Semaphore(1);
	
	synchronized void put(int i) {
		try {
	//		semProducer.acquire();
			n = i;
			System.out.println("PUT: " + i);
//			semConsumer.release();
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
		
	}
	
	 synchronized void get() {
		try {
	//		semConsumer.acquire();
			System.out.println("Got: " + n);
	//		semProducer.release();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

class Consumer implements Runnable {
	Q q;
	public Consumer(Q qObj) {
		q = qObj;
	}
	public void run() {
		for (int i = 1; i<=20; i++)
			q.get();
	}
}

class Producer implements Runnable {
	Q q;
	public Producer(Q qObj) {
		q = qObj;
	}
	public void run() {
		for (int i = 1; i<=20; i++)
			q.put(i);
	}
}



public class ConsumerProducerDemo {
	public static void main(String[] args) {
		Q q = new Q();
		
		new Thread(new Consumer(q)).start();
		new Thread(new Producer(q)).start();
	}

}
