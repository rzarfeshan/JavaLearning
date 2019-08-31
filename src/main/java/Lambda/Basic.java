package Lambda;

interface myInt{
	public void setValue();
}

interface myInt1 {
	public int getValue();
}

interface Factorial {
	int fact(int n);
}

interface ReverseString {
	String reverse(String str);
}

public class Basic {
	public static void main(String[] args) {
		myInt obj;
		
		obj = () -> System.out.println("Abhijeet");
		System.out.println("Rabeya");
		obj.setValue();
		
		myInt1 i1 = ()->1234;
		System.out.println(i1.getValue());

		Factorial f1 = (n) -> {
			int result = 1;
			for (int i = 1; i <= n ; i++ )
				result = result * i;
		return result; 
		};
		System.out.println("Factorial of 5 is: " + f1.fact(5));
		
		// Reverse a String
		ReverseString revStr = (str) -> {
			String result = ""; 
			for (int i = str.length()-1; i>=0; i--)
			{
				result += str.charAt(i);
			}
			return result;
		};
		
		System.out.println("Reverse of Expression is : " + revStr.reverse("expression"));
		System.out.println("Reverse of Rabeya is : " + revStr.reverse("rabeya"));
	}

}
