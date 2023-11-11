package CollectionFrame;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("AAA");
		hs.add("BBB");
		hs.add("CCC");
		hs.add("DDD");
		hs.add("EEE");
		System.out.println(hs);
		//hetrogenous elements
		hs.add(10);
		hs.add(20);
		System.out.println(hs);
		//only one null value allowed
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		//duplicate elements not allowed
		hs.add("BBB");
		System.out.println(hs);
	}

}
