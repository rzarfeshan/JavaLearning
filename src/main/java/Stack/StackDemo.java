package Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack intStack = new Stack();
		try {
		intStack.pop();
		}
		catch(RuntimeException ex) {
			System.out.println("Thanks! I have taken care.." + ex.getMessage());
		}
		intStack.push(15);
		intStack.push(18);
		intStack.pop();
		intStack.pop();
		
	}

}
