package CollectionFrame;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeMethodEx3 {

	public static void main(String[] args) {
		Deque<String> dq = new ArrayDeque<String>();
		dq.add("AAA");
		dq.add("BBB");
		dq.add("CCC");
		dq.add("DDD");
		System.out.println(dq);
		System.out.println();
		Iterator it = dq.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		
		Iterator it1 = dq.descendingIterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}

	}

}
