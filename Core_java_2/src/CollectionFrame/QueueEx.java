package CollectionFrame;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEx {
//Queue follow first in first out(FIFO)
	public static void main(String[] args) {
		Queue<String> q = new PriorityQueue<String>();
		q.offer("AAA");
		q.offer("BBB");
		q.offer("CCC");
		q.offer("DDD");
		q.offer("EEE");
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q);
		System.out.println();
		System.out.println("SECOND PART");
		System.out.println();
		
		Queue<String> q1 = new PriorityQueue<String>();
		
		System.out.println(q1);
		System.out.println(q1.poll());//poll return null value if queue is empty
		//System.out.println(q1.remove());//remove return exception if queue is empty
		System.out.println();
		System.out.println("THIRD PART");
		System.out.println();
		
		Queue<String> q2 = new PriorityQueue<String>();
		System.out.println(q2);
		System.out.println(q2.peek());//peek return null value if queue is empty
		System.out.println(q2.element());//element return exception if queue is empty
		
	}

}
