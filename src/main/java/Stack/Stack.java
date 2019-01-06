package Stack;

class Stack {
	int stack[] = new int[10];
	int top;
	
	Stack () {
		top = -1;
	}
	
	void push(int item) {
		if (top == 9) {
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
	
	int top() {
		if (top < 0)
		{
			return 0;
		}
		return stack[top];
	}
}
