package Collection;

import java.util.ArrayDeque;
// Implementaion of an stack using Array Deque
public class ArrayDequeDemo {
	public static void main(String[] args) {
		ArrayDeque<String> arrDeque = new ArrayDeque<String>();
		arrDeque.push("A");
		arrDeque.push("B");
		arrDeque.push("C");
		arrDeque.push("D");
		arrDeque.push("E");
		arrDeque.push("F");
		
		System.out.println(arrDeque);
		if (arrDeque.peek() != null) {
			arrDeque.poll();
		}
		
		System.out.println(arrDeque);
	}

}
