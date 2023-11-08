package CollectionFrame;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("AAA");
		ll.add("BBB");
		ll.add("CCC");
		ll.add("DDD");
		System.out.println(ll);
		
		ll.addFirst("FIRST");
		ll.addLast("LAST");
		System.out.println(ll);
		System.out.println();
		
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		System.out.println();
		ll.removeFirst();
		System.out.println(ll);
		System.out.println();
		System.out.println(ll.removeLast());
		System.out.println(ll);
		
		

	}

}
