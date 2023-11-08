package CollectionFrame;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(0,"AAA");
		al.add(1,"BBB");
		al.add(2,"CCC");
		al.add(3,"DDD");
		al.add(4,"EEE");
		System.out.println(al);
		
		al.add(2, "ANY");
		System.out.println(al);
		
		al.add(10);
		al.add(new StringBuffer("Zexd"));
		System.out.println(al);

	}

}
