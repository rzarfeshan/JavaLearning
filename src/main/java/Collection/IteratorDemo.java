package Collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		arrayList.add("F");
		
		Iterator <String> itr = arrayList.iterator();
		System.out.print("Original List: ");
		while (itr.hasNext()) {
			String element = itr.next();
			System.out.print(element + " ");
		}
		
		System.out.println();
		
		ListIterator<String> listItr = arrayList.listIterator();
		while (listItr.hasNext()) {
			String element = listItr.next();
			listItr.set(element + "+");
		}
		
		System.out.print("Modified content of the list: ");
		itr = arrayList.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		
		System.out.println();
		System.out.print("Traversing in reverse: ");
		while (listItr.hasPrevious()) {
			System.out.print(listItr.previous() + " ");
		}
		System.out.println();
	}

}
