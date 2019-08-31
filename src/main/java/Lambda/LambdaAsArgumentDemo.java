package Lambda;

interface StringInterface {
	String func(String str);
}

public class LambdaAsArgumentDemo {
	static String StringOperation(StringInterface strIntObj, String str) {
		return strIntObj.func(str);
	}
	
	public static void main(String[] args) {
		String out = StringOperation((str)->str.toUpperCase(), "Rabeya");
		System.out.println(out);
		
		// Reverse of String
		String reverse = StringOperation((str)->{
			String revString = "";
			for (int i = str.length()-1; i>=0; i--)
			{
				revString = revString + str.charAt(i);
			}
			return revString;
		}, out);
		
		System.out.println("Reverse of " + out + ": " + reverse);
		
		String inputStr = "My name is Rabeya";
		StringInterface strIntObj = (str) -> {
			String string = "";
			for (int i = 0 ; i <= str.length()-1; i++)
			{
				if (str.charAt(i) != ' ') {
					string += str.charAt(i);
				}
			}
			return string;
		};
		
		System.out.println("Without whitespace: " + StringOperation(strIntObj, inputStr));
		
	}

}
