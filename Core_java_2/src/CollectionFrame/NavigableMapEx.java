package CollectionFrame;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapEx {

	public static void main(String[] args) {
		NavigableMap<String, String> nm = new TreeMap<String, String>();
		nm.put("A", "AAA");
		nm.put("E", "EEE");
		nm.put("D","DDD");
		nm.put("B", "BBB");
		nm.put("C", "CCC");
		System.out.println(nm);
		
		System.out.println();
		System.out.println(nm.descendingKeySet());
		
		System.out.println();
		System.out.println(nm.descendingMap());

		System.out.println();
		System.out.println(nm.ceilingKey("D"));
		
		System.out.println();
		System.out.println(nm.ceilingEntry("D"));
				
		System.out.println();
		System.out.println(nm.higherKey("D"));
		
		System.out.println();
		System.out.println(nm.higherEntry("D"));
	}

}
