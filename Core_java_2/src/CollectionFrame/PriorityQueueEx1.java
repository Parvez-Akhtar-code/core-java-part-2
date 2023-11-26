package CollectionFrame;

import java.util.PriorityQueue;

public class PriorityQueueEx1 {

	public static void main(String[] args) {
	PriorityQueue<String> pq = new PriorityQueue<String>();
	pq.add("AAA");
	pq.add("BBB");
	pq.add("CCC");
	pq.add("DDD");
	pq.add("EEE");
	System.out.println(pq);
	pq.add("BBB");
	System.out.println(pq);
	}

}
