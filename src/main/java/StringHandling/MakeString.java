package StringHandling;

public class MakeString {
	public static void main(String[] args) {
		String s = new String();
		System.out.println("EMpty String: " + s);
		
		char c1[] = {'R','a','b','e','y','a'};
		String s1 = new String(c1);
		System.out.println("String initialized by an array of characters: " + s1);
		
		String s2 = new String(c1, 2, 3);
		System.out.println("subrange of a character array as an initializer: " +s2);
		
		String s3 = new String(s1);
		System.out.println("String initialized by another String: " +s3);
		
		// the byte-to-character conversion is done by 
		// using the default character encoding of the platform.
		byte ascii[] = {66, 67, 68, 69, 70, 72};
		String s4 = new String(ascii);
		System.out.println("String from Byte array: " +s4);
		
		String s5 = new String(ascii, 1, 3);
		System.out.println("range of byte String: " +s5);
		
		// length() API
		System.out.println("Length of s1: " + s1.length());
		
		String s6 = "ab¢üc"; 
		System.out.println("ab¢üc".length() + s6 );

		int i = 10;
		Integer j =10;
	    String strI = String.valueOf(j);
	    System.out.println(strI);
	    System.out.println(j.toString());
	}

}
