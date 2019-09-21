package Collection;

import java.util.Comparator;
import java.util.TreeSet;

//class StringComparator implements Comparator<String> {
//	public int compare (String str1, String str2) {
//		return str2.compareTo(str1);
//	}
//}

public class ComparatorDemo {
	public static void main(String[] args) {
		//TreeSet<String> strTree = new TreeSet<String>(new StringComparator());
		//TreeSet<String> strTree = new TreeSet<String>((str1, str2) -> str2.compareTo(str1));
		TreeSet<String> strTree = new TreeSet<String>((str1, str2) ->{ 
			int i = str1.lastIndexOf(" ");
			int j = str2.lastIndexOf(" ");
			
			int k = str1.substring(i).compareToIgnoreCase(str2.substring(j));
			if (k == 0) {
				k = str1.compareTo(str2);
			}
			return k; });
		strTree.add("Adam Smith");
		strTree.add("Roni Smith");
		strTree.add("John Ben");
//		strTree.add("Z");
//		strTree.add("X");
//		strTree.add("Y");
		
		System.out.println(strTree);
	}

}
