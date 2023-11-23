package CollectionFrame;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator<StringBuffer>{
	@Override
	public int compare(StringBuffer o1, StringBuffer o2) {
		
		return o1.length() - o2.length();
	}
}

public class ComparatorEx1 {

	public static void main(String[] args) {
	StringBuffer Sb1 = new StringBuffer("AAA");
	StringBuffer Sb2 = new StringBuffer("BBBB");
	StringBuffer Sb3 = new StringBuffer("C");
	StringBuffer Sb4 = new StringBuffer("DDDDD");
	StringBuffer Sb5 = new StringBuffer("EE");
	MyComparator mc = new MyComparator();
	
	TreeSet<StringBuffer> ts = new TreeSet<StringBuffer>(mc);
	ts.add(Sb1);
	ts.add(Sb2);
	ts.add(Sb3);
	ts.add(Sb4);
	ts.add(Sb5);
	System.out.println(ts);
	}

}
