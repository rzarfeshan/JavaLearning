package Basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assessment {
	public static void main(String[] args) {

		//conversion();
		//exception();
		//inheritance();
		callVarArgs();
	}
	
	static void callVarArgs() {
		Scanner scan = new Scanner(System.in);
		try {
			int a[] = new int[5];
			for (int i = 0; i<5; i++)
			{
				a[i] = scan.nextInt();
			}

			for (int i:a) {
				if (i > 50 && i < 1) {
					throw new Exception();
				}
				
			}
			odd (a[0]);
			odd (a[0], a[1]);
			odd (a[0], a[1],a[2]);
			odd (a[0], a[1],a[2], a[3]);
			odd (a[0], a[1],a[2], a[3], a[4]);
		}
		catch (InputMismatchException e) {
		}
		catch (Exception e) {
			System.out.println("Input out of range");
		}
		finally {
			scan.close();
		}
	}
	
	   static void odd(int ...a) 
	   {
		   for (int i = 0; i < a.length; i++) {
	    	   
	           if (a[i]%5 == 0 )
	           {
	        	  if (i != 0)
	        		  System.out.print(" ");
	        	   System.out.print(a[i] );
	           }
	           
	       }
		   System.out.println();
	   }
	static void mul (int ...a)
	{
		int product = 1;
		for (int i:a) {
			product*=i;
		}
		System.out.println(product);
	}
	
	static void conversion() {
//		Scanner scan = new Scanner(System.in);
//		try {
//			int i = scan.nextInt();
//			if (i <= 20 && i >= -20)
//			{
//				@SuppressWarnings("unused")
//				String str = String.valueOf(i);
//				System.out.println("Successful Conversion");
//			}
//			else
//			{
//				System.out.println("Conversion Unsuccessful");
//			}
//			scan.close();
//		}
//		catch(InputMismatchException e)
//		{
//			System.out.println("Conversion Unsuccessful");
//		}
	}
	
	static void exception() {
		try {
			Scanner scan = new Scanner(System.in);
			int i = scan.nextInt();
			int j = scan.nextInt();
		
			if (i < 0 || j < 0) {
				scan.close();
				throw new Exception();
			}
			else
			{
				System.out.println(i*j);
			}
			scan.close();
		}
		catch (Exception e) {
			System.out.println(e + ": x and y should not be zero.");
		}
	}
	
	static void stringTest() {
		//int a = 123451234512345;
		//String str = "Hello World!";
		//String msg = str.substring(6, 12) + str.substring(12, 6);
		//System.out.println(msg);
	}
	

	static void inheritance() {
		Player player = new Player();
		player.game();
		player.captain();
		
		THIRD third = new THIRD();
		third.one();
		third.two();
		third.three();
		
		ALLROUNDER allrounder = new ALLROUNDER();
	      allrounder.bat();
	      allrounder.bowl();
	      allrounder.both();
	}
}


class Cricket {
	public void game() {
		System.out.println("GENTLEMEN GAME");
	}
}

class Player extends Cricket {
	public void captain() {
		System.out.println("SAURAV GANGULY");
	}
}

class FIRST {
	void one () {
		System.out.println("This is base class.");
	}
}

class SECOND extends FIRST {
	void two () {
		System.out.println("This inherits class FIRST.");
	}
}

class THIRD extends SECOND {
	void three() {
		System.out.println("This inherits class SECOND.");
	}
}

class BATSMAN {
	void bat() {
		System.out.println("I am Batsman");
	}
}

class BOWLER extends BATSMAN{
	void bowl( ) {
		System.out.println("I am Bowler");
	}
}

class ALLROUNDER extends BOWLER {
	void both () {
		System.out.println("I am Batsman and Bowler");
	}
}