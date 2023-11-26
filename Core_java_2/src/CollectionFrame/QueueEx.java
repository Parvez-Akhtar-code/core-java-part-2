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
	}

}
