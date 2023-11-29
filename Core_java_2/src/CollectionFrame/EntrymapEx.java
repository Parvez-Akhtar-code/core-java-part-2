package CollectionFrame;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EntrymapEx {

	public static void main(String[] args) {
		Map<String, String> m = new HashMap<String, String>();
		m.put("A", "AAA");
		m.put("B", "BBB");
		m.put("C", "CCC");
		m.put("D", "DDD");
		System.out.println(m);
		
		
		System.out.println();
		Set<Map.Entry<String, String>> set = m.entrySet();
		Iterator<Map.Entry<String, String>> it = set.iterator();
		while(it.hasNext()) {
			Map.Entry<String, String> entry = it.next();
			System.out.println(entry.getKey()+","+entry.getValue());
		}
		
		

	}

}
