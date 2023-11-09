package CollectionFrame;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("AAA");
		list.add("BBB");
		list.add("CCC");
		list.add("DDD");
		System.out.println(list);
		System.out.println();
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		
		List<String> list1 = new ArrayList<String>();
		list1.add("Junaid");
		list1.add("Ayan");
		list1.add("Jamil");
		list1.add("Zakir");
		System.out.println(list1);
		System.out.println();
		
		Iterator<String> it1 = list1.iterator();
		while(it1.hasNext()) {
			String element = it1.next();
			if(element.equals("Jamil")) {
				it1.remove();
			}
		}
		System.out.println(list1);

	}

}
