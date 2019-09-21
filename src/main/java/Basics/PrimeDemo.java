package Basics;

import java.util.InputMismatchException;
import java.util.Scanner;

@FunctionalInterface
interface PrimeNumber {
	boolean isPrimeNumber(int number);
}

public class PrimeDemo {
	public static void main(String[] args) {
		primeNumber();
	}
	
	static void primeNumber () {
		Scanner scan = new Scanner(System.in);
		try {
			
			PrimeNumber pm = (num) -> {
				if (num <= 0 || num == 1) {
					return false;
				}
				
				boolean isPrime = true;
				int count = num/2;
				while (count>1 && isPrime)
				{
					if ( num%count == 0 )
						isPrime = false;
					count--;
				}
				return isPrime;
			};
			
			int number = scan.nextInt();
			if (pm.isPrimeNumber(number))
			{
				System.out.println("PRIME");
			}
			else
			{
				System.out.println("NOT PRIME");
			}
		}
		catch (InputMismatchException e) {
			
		}
		finally {
			scan.close();
		}
	}
}
