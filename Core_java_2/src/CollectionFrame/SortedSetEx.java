package CollectionFrame;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetEx {

	public static void main(String[] args) {
		SortedSet<String> ss = new TreeSet<String>();
		//it allows sorting in values
		ss.add("BBB");
		ss.add("EEE");
		ss.add("AAA");
		ss.add("DDD");
		ss.add("CCC");
		System.out.println(ss);
		
		//methods
		System.out.println(ss.first());//AAA
		System.out.println(ss.last());//BBB
		System.out.println(ss.headSet("DDD"));//[AAA,BBB,CCC]
		System.out.println(ss.tailSet("DDD"));//[DDD,EEE]
		System.out.println(ss.subSet("BBB", "EEE"));//[BBB,CCC,DDD]

	}

}
