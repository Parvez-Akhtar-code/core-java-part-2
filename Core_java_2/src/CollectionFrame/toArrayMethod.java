package CollectionFrame;

import java.util.ArrayList;

public class toArrayMethod {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		al.add("ddd");
		System.out.println(al);
		
		Object[] el = al.toArray();
		
		for(Object ele : el) {
			System.out.println(ele);
		}
		
		System.out.println();
		
		for(int i=0;i<el.length;i++) {
			System.out.println(el[i]);
		}

	}

}
