package CollectionFrame;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationEx {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("AAA");
		v.add("BBB");
		v.add("CCC");
		v.add("DDD");
		System.out.println(v);
		System.out.println();
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
