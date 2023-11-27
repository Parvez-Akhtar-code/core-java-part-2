package CollectionFrame;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMethodEx2 {

	public static void main(String[] args) {
		Deque<String> dq1 = new ArrayDeque<String>();
		dq1.add("AAA");
		dq1.add("BBB");
		dq1.add("CCC");
		dq1.add("DDD");
		System.out.println(dq1);
		System.out.println(dq1.getFirst());
		System.out.println(dq1.peekFirst());
		
		/* getFirst() will raise an exception in empty queue , but peekFirst will show null value as output
		 * 
		 */
		
		System.out.println();
		System.out.println(dq1.getLast());
		System.out.println(dq1.peekLast());
		
		/* getLast() will raise an exception in empty queue , but peekLast will show null value as output
		 * 
		 */
		System.out.println();
		Deque<String> dq2 = new ArrayDeque<String>();
		dq2.add("ABC");
		dq2.add("BCD");
		dq2.add("CDE");
		dq2.add("DEF");
		dq2.add("BCD");
		dq2.add("FGH");
		dq2.add("ABC");
		System.out.println(dq2);
		System.out.println(dq2.removeFirstOccurrence("BCD"));
		System.out.println(dq2);
		System.out.println(dq2.removeLastOccurrence("ABC"));
		System.out.println(dq2);
	}

}
