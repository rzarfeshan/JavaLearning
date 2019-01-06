package Stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class TestStack {
	Stack myStack;
	@Before
	public void setUp() throws Exception {
		myStack = new Stack();
	}

	@Test
	public void basicPush() {
		myStack.push(10);
		assertEquals(10, myStack.top());
	}
	
	@Test(expected=RuntimeException.class)
	public void pushException() {
		myStack.push(10);
		myStack.push(11);
		myStack.push(12);
		myStack.push(13);
		myStack.push(14);
		myStack.push(15);
		myStack.push(16);
		myStack.push(17);
		myStack.push(18);
		myStack.push(19);
		myStack.push(20);
	}

	@Test
	public void basicPop() {
		myStack.push(19);
		myStack.pop();
		assertNotEquals(19, myStack.top());
	}
	
	@Test(expected=RuntimeException.class)
	public void popException() {
		myStack.pop();
	}
}
