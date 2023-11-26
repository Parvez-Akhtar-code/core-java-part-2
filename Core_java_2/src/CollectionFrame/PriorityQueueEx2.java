package CollectionFrame;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueEx2 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("AAA");
		StringBuffer sb2 = new StringBuffer("BBBBB");
		StringBuffer sb3 = new StringBuffer("C");
		StringBuffer sb4 = new StringBuffer("DD");
		StringBuffer sb5 = new StringBuffer("EEEE");
		
		Comparator<StringBuffer> c = new Comparator<StringBuffer>() {
			
			@Override
			public int compare(StringBuffer s1, StringBuffer s2) {
				
				return s1.length()-s2.length();
			}
		};
		
		PriorityQueue<StringBuffer> pq = new PriorityQueue<StringBuffer>(c);
		pq.add(sb1);
		pq.add(sb2);
		pq.add(sb3);
		pq.add(sb4);
		pq.add(sb5);
		System.out.println(pq);
	}

}
