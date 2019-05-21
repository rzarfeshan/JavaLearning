package MultiThreading;

public class CurrentThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		Thread t = Thread.currentThread();
		System.out.println("I am " + t);
		t.setName("MyFirstThread");
		System.out.println("Now I am " + t);
		System.out.println("My name is  " + t.getName());
		System.out.println("My state is  " + t.getState());
		System.out.println("My priority is  " + t.getPriority());
		
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("counter - " +i);
				Thread.sleep(1000);
			}
		}finally {
			System.out.println("I am done");
		}

	}

}
