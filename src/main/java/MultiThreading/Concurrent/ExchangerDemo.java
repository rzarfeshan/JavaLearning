package MultiThreading.Concurrent;

import java.util.concurrent.Exchanger;

public class ExchangerDemo {
	public static void main(String[] args) {
		Exchanger<String> exc = new Exchanger<>();
		
		MakeString ms = new MakeString(exc);
		UseString us = new UseString(exc);
		
		
		new Thread(ms).start();
		new Thread(us).start();
		
	}
}

class MakeString implements Runnable {
	Exchanger<String> e;
	String str;
	
	MakeString(Exchanger<String> ex) {
		e = ex;
		str = new String();
	}
	
	public void run() {
		char ch = 'A';
		
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				str += ch++;
			}
			try {
				str = e.exchange(str);
			}
			catch (InterruptedException ex)
			{
				System.out.println(ex);
			}
		}
	}
}

class UseString implements Runnable {
	Exchanger<String> e;
	String str;
	
	UseString(Exchanger<String> ex) {
		e = ex;
		str = new String();
	}
	
	public void run() {
	
		for (int i = 0; i < 3; i++)
		{
			try {
				//exchange an empty buffer for a full one.
			str = e.exchange(new String());
			System.out.println("Got: " + str);
			}
			catch (InterruptedException ex)
			{
				System.out.println(ex);
			}
		}
	}
}