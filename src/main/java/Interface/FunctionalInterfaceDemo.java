package Interface;

@FunctionalInterface
interface myRunnable {
	public abstract void run();

	@Override
	String toString();
	
	
}
public class FunctionalInterfaceDemo {
	
	public static void main(String[] args) {
		myRunnable myObj = ()->System.out.println("Rabeya");
		
	}
}
