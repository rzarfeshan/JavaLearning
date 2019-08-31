package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> subscriberMsisdn = new HashSet<>();
		subscriberMsisdn.add("123");
		subscriberMsisdn.add("23");
		subscriberMsisdn.add("34");
		subscriberMsisdn.add("55");
		subscriberMsisdn.add("66");
		System.out.println(subscriberMsisdn);
		Set<String> failedSubscriber = new HashSet<>();
		failedSubscriber.add("dd");
		failedSubscriber.add("sd");
		failedSubscriber.add("ds");
		failedSubscriber.add("hh");
		failedSubscriber.add("tt");	
		System.out.println(failedSubscriber);
		subscriberMsisdn = failedSubscriber;
		//failedSubscriber = new HashSet<String>();
		failedSubscriber.clear();
		System.out.println(subscriberMsisdn);
		System.out.println("[" + failedSubscriber + "]");
		
		try {
		List<Integer> myList = new ArrayList<Integer>();// = Collections.emptyList();
		List<Integer> myList3 = new ArrayList<Integer>();
		myList.add(1);
		myList.add(2);
		final List<Integer> myList2 = myList;
		myList2.add(3);
		//myList2 = myList3; --> Error because of final keyword
		System.out.println(myList);
		}
		catch (Exception e) {
			System.out.println(e);
			//System.out.println(e.get);
		}

	}

}
