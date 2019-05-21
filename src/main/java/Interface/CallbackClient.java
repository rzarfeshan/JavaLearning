package Interface;

interface Callback {
	void callback();
	// void callbackAgain() {} -- error abstract method cant contain body.
	
}

public class CallbackClient implements Callback{
	public void callback() {
		System.out.println("I am callback");
	}
	
	public static void main(String[] args) {
		Callback objClient = new CallbackClient();
		objClient.callback();
	}
 }
 
class test { 
	
}

