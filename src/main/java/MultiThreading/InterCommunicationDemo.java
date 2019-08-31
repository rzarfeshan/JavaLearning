package MultiThreading;

class Q {
	int n;
	boolean valueSet = false;
	
	synchronized int get() {
		while (!valueSet) {
			try {
				wait();
			} catch(InterruptedException e) {
				System.out.println("Caught Exception");
			}
		}
		System.out.println("Got:  " + n);
		valueSet = false;
		notify();
		return n;
	}
	
	synchronized void put(int n) {
		while (valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Caught InterruptedException");
			}
		}
		this.n = n;
		valueSet = true;
		System.out.println("Put: " + n);
		notify();
	}
}

class Consumer implements Runnable {
	Thread t;
	Q q;
	
	Consumer(Q qObj) {
		q = qObj;
		t = new Thread(this, "Consumer");
	}
	
	public void run() {
		while(true) {
			q.get();
		}
	}
}

class Producer implements Runnable {
	Thread t;
	Q q;
	
	Producer (Q qObj) {
		q = qObj;
		t = new Thread(this, "Producer");
	}
	
	public void run() {
		int i = 0;
		while (true && i < 5) {
			q.put(i++);
		}
		
	}
	
}

public class InterCommunicationDemo {
	public static void main(String[] args) {
		Q q = new Q();
		Consumer con = new Consumer(q);
		Producer prod = new Producer(q);
		
		con.t.start();
		prod.t.start();
		
	}

}
