package CollectionFrame;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListItretorEx {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("AAA");
		list.add("BBB");
		list.add("CCC");
		list.add("DDD");
		list.add("EEE");
		System.out.println(list);
		System.out.println();
		
		ListIterator<String> lit = list.listIterator();
		System.out.println("Forward Reading : ");
		while(lit.hasNext()) {
			System.out.println(lit.nextIndex()+"."+lit.next());
		}
		
		System.out.println();
		System.out.println("Backward Reading : ");
		while(lit.hasPrevious()) {
			System.out.println(lit.previousIndex()+"."+lit.previous());
		}

	}

}
