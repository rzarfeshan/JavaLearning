package Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack intStack = new Stack(5);
		Stack stringStack = new Stack(10);
		try {
		intStack.pop();
		}
		catch(RuntimeException ex) {
			System.out.println("Thanks! I have taken care.." + ex.getMessage());
		}
		stringStack.push("I am Rabeya");
		intStack.push(15);
		intStack.push(18);
		intStack.pop();
		intStack.pop();
		
	}

}
