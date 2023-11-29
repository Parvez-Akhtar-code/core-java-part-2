package CollectionFrame;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx3 {

	public static void main(String[] args) {
		Map<String, String> m = new HashMap<String, String>();
		m.put("A", "AAA");
		m.put("B", "BBB");
		m.put("C", "CCC");
		m.put("D", "DDD");
		System.out.println(m);
		System.out.println();
		System.out.println(m.containsKey("B"));
		System.out.println(m.containsKey("J"));
		System.out.println(m.containsValue("CCC"));
		System.out.println(m.containsValue("MMM"));
		
		System.out.println();
		Set<String> set = m.keySet();
		System.out.println(set);
		
		System.out.println();
		Collection<String> cl = m.values();
		System.out.println(cl);
	}

}
