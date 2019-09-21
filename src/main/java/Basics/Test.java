package Basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
//import java.io.OutputStreamWriter;
class TestA {
	protected int x, y;
}

class A {int x = 5;
void print() {
	System.out.println("I am in A");
	}
}
class B extends A {
	int y = 10;
void printB() {
	System.out.println("I am in B");
}
}

public class Test {
	public static void readString() {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String[] str = new String[5];
		int count = 0;
		try {
			while (count < 5) {
			str[count] = bufferedReader.readLine();
			count++;
			}
			
			for (int j = 0; j<5; j++)
			{
				if (j == 4) {
					System.out.print(str[j]);
				}
				else {
					System.out.println(str[j]);
				}
			}
		}
		catch (IOException e) {
		}
	}
	public static void main(String[] args) {
		TestA a = new TestA();
		System.out.println("Protect " + a.x + " " + a.y );
		
		//readString();
		
//		Scanner Obj = new Scanner(System.in);
//		String str = Obj.nextLine();
//		int startINdex = Obj.nextInt();
//		int length = Obj.nextInt();
//		System.out.println(str.substring(startINdex, length+1));
		
//		Scanner scanObj = new Scanner(System.in);
//		String str1 = scanObj.nextLine();
//		String str2 = scanObj.nextLine();
//		
//		System.out.println(str1.trim().concat(str2.trim()).trim());
//		scanObj.close();
		
//		StringBuffer str = new StringBuffer("polls tests");
//		str.insert(6, "Good ");
//		System.out.println(str);
//		
//		Object myObj = new String[] {"one", "two"};
//		for(String s: (String[])myObj) {
//			System.out.print(s+".");
//		}
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String c = scan.next();
		
		if (str.contains(c.trim()))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}
