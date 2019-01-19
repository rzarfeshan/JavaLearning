package Stack;

class Stack {
	//int stack[] = new int[10];
	int stack[];
	String stck[];
	int top;
	
	Stack () {
		top = -1;
	}
	
	Stack(int length){
		System.out.println("I am called");
		stack = new int[length];
		stck = new String[length];
		System.out.println("Stck size is = " + stack.length);
		top = -1;
	}
	
	void push(int item) {
		if (top == stack.length) {
			throw new RuntimeException("Stack full");
		}
		stack[++top] = item;
		System.out.println(item);
	}
	
	void pop() {
		if (top < 0) {
			throw new RuntimeException("Stack UnderFlow");
		}
		System.out.println("item removed is: " + stack[top]);
		top--;
	}

	void push(String item) {
		if (top == stack.length) {
			throw new RuntimeException("Stack full");
		}
		stck[++top] = item;
		System.out.println(item);
	}
	
	int top() {
		if (top < 0)
		{
			return 0;
		}
		return stack[top];
	}
}
