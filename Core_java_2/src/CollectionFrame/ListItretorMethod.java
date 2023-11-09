package CollectionFrame;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListItretorMethod {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("AAA");
		ll.add("BBB");
		ll.add("CCC");
		ll.add("DDD");
		ll.add("EEE");
		System.out.println(ll);
		System.out.println();
		ListIterator<String> lit = ll.listIterator();
		while(lit.hasNext()) {
			String element = lit.next();
			if(element.equals("BBB")) {
				lit.add("XXX");//will add XXX after BBB
			}
			if(element.equals("DDD")) {
				lit.set("YYY"); //will replace DDD to YYY
			}
			if(element.equals("EEE")) {
				lit.remove();//will remove EEE
			}
		}
		System.out.println(ll);//[AAA,BBB,XXX,CCC,YYY]

	}

}
