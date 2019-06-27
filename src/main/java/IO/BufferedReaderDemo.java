package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;

public class BufferedReaderDemo {
	
	static void readChar(BufferedReader br) {
		System.out.println("Enter the character, to quit use q: ");
		char c;
		// read characters
		try {
			do {
				c = (char) br.read();
				System.out.println(c);

			} while (c != 'q');
		} catch (IOException e) {
			System.out.println("Caught IOException");
		}
	}

	
	static void readString(BufferedReader br) {
		System.out.println("Enter line of text: ");
		System.out.println("Enter 'stop' to quit: ");
		
		String str;
		try {
			do {
				str = br.readLine();
				System.out.println(br);
			} while (!str.equals("stop"));
		}catch (IOException e) {
			System.out.println("Caught IOException");
		}
	}
	
	public static void main(String[] args) {
		//BufferedReader brChar = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader brString = new BufferedReader(new InputStreamReader(System.in));
		//readChar(brChar);
		//readString(brString);
		
		int b;
		b = 'A';
		System.out.write(b);
		System.out.write('\n');
		
		PrintWriter pw = new PrintWriter(System.out, true);
		pw.println("I am Rabeya");
		int i = -3;
		pw.println(i);
		double d = 4.5e-7;
		pw.println(d);
	}
}
