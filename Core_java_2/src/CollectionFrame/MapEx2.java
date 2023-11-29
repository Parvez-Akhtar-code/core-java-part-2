package CollectionFrame;

import java.util.HashMap;
import java.util.Map;

public class MapEx2 {

	public static void main(String[] args) {
		Map<String, String> m1 = new HashMap<String, String>();
		m1.put("A", "AAA");
		m1.put("B", "BBB");
		m1.put("C","CCC");
		m1.put("D", "DDD");
		m1.put("E", "EEE");
		System.out.println(m1);
		System.out.println(m1.remove("E"));
		System.out.println(m1);
		
		System.out.println();
		System.out.println(m1.size());
		
		System.out.println();
		System.out.println(m1.isEmpty());
		
		
		System.out.println();
		m1.clear();
		System.out.println(m1);
		
		
		System.out.println();
		System.out.println(m1.isEmpty());

	}

}
