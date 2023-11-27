package CollectionFrame;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMethodEx1 {

	public static void main(String[] args) {
		Deque<String> dq1 = new ArrayDeque<String>();
		dq1.addFirst("AAA");
		dq1.addFirst("BBB");
		System.out.println(dq1);
		dq1.offerFirst("CCC");
		dq1.offerFirst("DDD");
		System.out.println(dq1);
		
		/* in addFirst() it will raise an exception in bounded queues if we add a value after the max capacity ,
		 *  but offerFirst will not raise an exception in bounded quese if we add a value after the max capacity
		 */
		
		System.out.println();
		Deque<String> dq2 = new ArrayDeque<String>();
		dq2.addLast("ABC");
		dq2.addLast("BCD");
		System.out.println(dq2);
		dq2.offerLast("CDE");
		dq2.addLast("DEF");
		System.out.println(dq2);
		
		/* in addLast() it will raise an exception in bounded queues if we add a value after the max capacity ,
		 *  but offerLast() will not raise an exception in bounded quese if we add a value after the max capacity
		 */
		
		System.out.println();
		Deque<String> dq3 = new ArrayDeque<String>();
		dq3.add("AAA");
		dq3.add("BBB");
		dq3.add("CCC");
		System.out.println(dq3);
		System.out.println(dq3.removeFirst());
		System.out.println(dq3);
		System.out.println(dq3.pollFirst());
		System.out.println(dq3);
		
		/* if we perform removeFirst() in empty queue it will raise an exception but if we perform pollFirst() it will show null 
		 * value as output
		 */
		
		System.out.println();
		Deque<String> dq4 = new ArrayDeque<String>();
		dq4.add("ABC");
		dq4.add("BCD");
		dq4.add("CDE");
		System.out.println(dq4);
		System.out.println(dq4.removeLast());
		System.out.println(dq4);
		System.out.println(dq4.pollLast());
		System.out.println(dq4);
		
		/* if we perform removeLast() in empty queue it will raise an exception but if we perform pollLast() it will show null 
		 * value as output
		 */
		
		
	}

}
