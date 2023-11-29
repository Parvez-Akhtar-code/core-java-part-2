package CollectionFrame;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapEx {

	public static void main(String[] args) {
		SortedMap<String, String> sm = new TreeMap<String, String>();
		sm.put("E", "EEE");
		sm.put("A", "AAA");
		sm.put("C", "CCC");
		sm.put("D", "DDD");
		sm.put("B", "BBB");
		System.out.println(sm);
		
		System.out.println();
		System.out.println(sm.firstKey());
		
		System.out.println();
		System.out.println(sm.lastKey());
		
		System.out.println();
		System.out.println(sm.headMap("C"));
		
		System.out.println();
		System.out.println(sm.tailMap("D"));
		
		System.out.println();
		System.out.println(sm.subMap("B", "E"));

	}

}
