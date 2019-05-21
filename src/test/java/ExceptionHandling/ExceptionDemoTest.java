package ExceptionHandling;

import org.junit.Test;

public class ExceptionDemoTest {

	@Test
	public void testNestTry() {
		try {
			NestTry.nestTry(1);
		} catch (ArithmeticException e) {
			System.out.println("Caught ArithmeticException");
		}

	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testNestTry1() {
		try {
			NestTry.nestTry(2);
		} catch (ArithmeticException e) {
			System.out.println("Caught ArithmeticException");
		}

	}
}
