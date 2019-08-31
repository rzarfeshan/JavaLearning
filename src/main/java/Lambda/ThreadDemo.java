package Lambda;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadDemo {

	private void setSubscriberPreActivationFlag() {
		System.out.println("setSubscriberPreActivationFlag: " + Thread.currentThread().getId() + " ::"
				+ System.currentTimeMillis() + "::::::" + Thread.currentThread().getName());
	}

	public void myExecuter() {
//		ScheduledThreadPoolExecutor myScheduler = new ScheduledThreadPoolExecutor(1);
//		System.out.println("myExecuter: " + Thread.currentThread().getId() + " ::" + System.currentTimeMillis()
//				+ "::::::" + Thread.currentThread().getName());
//		myScheduler.scheduleAtFixedRate(() -> setSubscriberPreActivationFlag(), 5, TimeUnit.SECONDS.toSeconds(1),
//				TimeUnit.SECONDS);
//		myScheduler.shutdown();

		ScheduledExecutorService mySchedulerService = Executors.newScheduledThreadPool(1);
		System.out.println("myExecuter: " + Thread.currentThread().getId() + " ::" + System.currentTimeMillis()
				+ "::::::" + Thread.currentThread().getName());
		mySchedulerService.schedule(() -> setSubscriberPreActivationFlag(), 5, TimeUnit.MINUTES);
		mySchedulerService.shutdown();

	}

	public static void main(String[] args) {

		new ThreadDemo().myExecuter();
	}
}
