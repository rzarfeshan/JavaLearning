package Collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
	//	Set<String> hashSet1 = new HashSet<String>();
		
		hashSet.add("alpha");
		hashSet.add("beta");
		hashSet.add("gamma");
		hashSet.add("eta");
		hashSet.add("omega");
		
		System.out.println(hashSet);
	}

}
