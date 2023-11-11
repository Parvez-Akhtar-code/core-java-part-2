package CollectionFrame;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("BBB");
		ts.add("CCC");
		ts.add("DDD");
		ts.add("EEE");
		ts.add("AAA");
		System.out.println(ts);
		ts.add("BBB");
		System.out.println(ts);

	}

}
