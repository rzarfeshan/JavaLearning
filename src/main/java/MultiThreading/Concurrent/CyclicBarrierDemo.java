package MultiThreading.Concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class BarrierAction implements Runnable {
	public void run() {
		System.out.println("Barrier Reached!");
	}
}

class MyProcess implements Runnable {
	CyclicBarrier cb;
	MyProcess (CyclicBarrier cb) {
		this.cb = cb;
	}
	
	public void run() {
		try {
			System.out.println("My name is " + Thread.currentThread().getName() + ": " + cb.await());
			System.out.println();
		}
		catch (InterruptedException e) {
			System.out.println(e);
		}
		catch (BrokenBarrierException e) {
			System.out.println(e);
		}
	}
}

public class CyclicBarrierDemo {
	public static void main(String[] args) {
		CyclicBarrier cb = new CyclicBarrier(3, new BarrierAction());
		
		new Thread (new MyProcess(cb), "TEAM1").start();
		new Thread (new MyProcess(cb), "TEAM2").start();
		new Thread (new MyProcess(cb), "TEAM3").start();
		
		new Thread (new MyProcess(cb), "TEAM4").start();
		new Thread (new MyProcess(cb), "TEAM5").start();
		new Thread (new MyProcess(cb), "TEAM6").start();
	}
}
