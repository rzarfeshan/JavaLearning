package Basics;

import java.util.Scanner;
import java.util.InputMismatchException;

@FunctionalInterface
interface Multiple {
	boolean isMultiple(int num);
}
public class MultipleDemo {
	public static void main(String[] args) {
		multipleOf3();
	}

	static void multipleOf3() {
		Scanner scan = new Scanner(System.in);
		try {
			Multiple mul = (num) -> {
				
				return num%3 == 0 ;
			};
			
			
			int testCaseNum = scan.nextInt();
			if (testCaseNum > 5 && testCaseNum < 1) {
				throw new Exception();
			}
			int[] number = new int[testCaseNum];
			for (int i = 0; i < testCaseNum; i++)
			{
				number[i] = scan.nextInt();
				if (number[i] > 1000 && number[i] < 0) {
					throw new Exception();
				}
			}
			for(int n:number)
			{
				if (mul.isMultiple(n)) {
					System.out.println("YES");
				}
				else {
					System.out.println("No");
				}
			}
			
		}
		catch (InputMismatchException e) {
			
		}
		catch (Exception e) {
			
		}
		finally {
			scan.close();
		}
	}
}
