package Basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
//import java.io.OutputStreamWriter;

class A {int x = 5;}
class B extends A {int y = 10;}
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
//		A a = new B();
//		System.out.println(a.x);
		//readString();
		
//		Scanner Obj = new Scanner(System.in);
//		String str = Obj.nextLine();
//		int startINdex = Obj.nextInt();
//		int length = Obj.nextInt();
//		System.out.println(str.substring(startINdex, length+1));
		
		Scanner scanObj = new Scanner(System.in);
		String str1 = scanObj.nextLine();
		String str2 = scanObj.nextLine();
		
		System.out.println(str1.trim().concat(str2.trim()).trim());
		scanObj.close();
	}

}
