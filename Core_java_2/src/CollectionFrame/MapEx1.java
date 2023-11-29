package CollectionFrame;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {

	public static void main(String[] args) {
		Map<String, String> m = new HashMap<String, String>();
		m.put("A", "AAA");
		m.put("B", "YYY");
		m.put("C", "CCC");
		m.put("D", "DDD");
		System.out.println(m);
		
		System.out.println(m.put("B", "BBB"));
		System.out.println(m);
		System.out.println();
		Map<String, String> m1 = new HashMap<String, String>();
		m1.putAll(m);
		System.out.println(m1);
		
		
		System.out.println();
		System.out.println(m.get("B"));
	}

}
