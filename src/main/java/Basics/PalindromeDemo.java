package Basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

@FunctionalInterface
interface Palindrome<T> {
	boolean isPalidrome(T arg);
}

public class PalindromeDemo {
	public static void main(String[] args) {
		//basicPalindrome();
		intPalindrome();
	}
	
	static void intPalindrome() {
		Scanner scan = new Scanner(System.in);
		
		try {
			Palindrome<Integer> pal = (num) -> {
				int rev = 0;
				int temp = num;
			
				while (num > 0) {
					int mod = num%10;
					rev = (rev*10) + mod;
					num = num/10;
				}
				if (temp == rev) {
					return true;
				}
				else {
					return false;
				}
			};
			
			int t = scan.nextInt();
			if (t < 1 || t > 5) {
				throw new Exception();
			}
			int[] number = new int[t];
			for (int i = 0; i < t; i++) {
				number[i] = scan.nextInt();
				if (number[i] < 1 || number[i] > 1000) {
					throw new Exception();
				}
			}
			for (int n:number) {
				if (pal.isPalidrome(n)) {
					System.out.println("Palindrome");
				}
				else {
					System.out.println("Not a Palindrome");
				}
			}
		}
		catch (InputMismatchException e) {
			
		}
		catch (Exception e) {
			System.out.println("Input Error");
		}
		finally {
			scan.close();
		}
	}
	
	static void basicPalindrome() {
		try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
			String palStr = bufferedReader.readLine();
			Palindrome<String> pal = (str)-> {
				int strLength = str.length();
				boolean isPalindrome = true;
				for (int i = 0, j = 1; i < strLength/2; i++, j++)
				{
					if (str.charAt(i) != str.charAt(strLength-j)) {
						isPalindrome = false;
						break;
					}
				}
				return isPalindrome;
			};
			if (pal.isPalidrome(palStr)) {
				System.out.println("String is palindrome");
			}
			else
			{
				System.out.println("String is not palindrome");
			}
		}
		catch (IOException e) {
		}
	}
	
	static void StringBuilderPalindrome() {
		try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
			StringBuilder str = new StringBuilder(bufferedReader.readLine());
			StringBuilder strRev = new StringBuilder(str);
			str.reverse();
			System.out.println(str);
			System.out.println(strRev);
			boolean isPalindrome = str.compareTo(strRev) == 0?true:false;
			System.out.println(isPalindrome);
			System.out.println(strRev);
			System.out.println(str);
			if (isPalindrome)
			{
				System.out.println("Palindrome");
			}
			else
			{
				System.out.println("Not a palindrome");
			}
		}
		catch (IOException e) {
			
		}
	}

}
