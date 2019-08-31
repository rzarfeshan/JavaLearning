package MultiThreading.Concurrent;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class ThreadExecutor implements Runnable {
	public void run() {
		System.out.println("I m executed");
	}
}

public class ExecutorDemo {

	public static void main(String[] args) {
		ScheduledExecutorService myScheduledExecutorService = null;
		try {
			
			myScheduledExecutorService = Executors.newScheduledThreadPool(1);
			myScheduledExecutorService.scheduleAtFixedRate(new Thread(new ThreadExecutor()), 1, TimeUnit.SECONDS.toSeconds(1), TimeUnit.SECONDS);
		}

		finally {
			myScheduledExecutorService.shutdown();
		}
	}

}
