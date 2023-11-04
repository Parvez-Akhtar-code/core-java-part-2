package CollectionFrame;

import java.util.ArrayList;
import java.util.List;

public class ListIndexOf {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add(0, "AAA");
		list1.add(1, "BBB");
		list1.add(2, "CCC");
		list1.add(3, "DDD");
		list1.add(4, "EEE");
		list1.add(5, "FFF");
		list1.add(6, "GGG");
		list1.add(7, "BBB");
		System.out.println(list1);
		
		//indexof method will show first occurance index of that element
		System.out.println(list1.indexOf("BBB"));
		
		//to know last occurance index of that element we will use lastindexof
		System.out.println(list1.lastIndexOf("BBB"));

	}

}
