package Collection;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList <String> linkedList = new LinkedList<String>();
		linkedList.add("A1");
		linkedList.addFirst("A");
		linkedList.offer("B1");
		linkedList.offerLast("B2");
		System.out.println(linkedList);
		System.out.println(linkedList.get(1));
		String valForPoll = linkedList.poll();
		System.out.println(valForPoll);
		linkedList.offerLast(valForPoll);
		System.out.println(linkedList);
	}

}
