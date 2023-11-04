package CollectionFrame;

import java.util.ArrayList;
import java.util.List;

public class ListAddMethod {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add(0,"parvez");
		list.add(1, "junaid");
		list.add(2, "anwar");
		list.add(3, "ayan");
		 
		System.out.println(list);
		
		//if we add next value of max value of the index it will add automatically
		list.add("salim");
		System.out.println(list);
		
		
	/*	
	 * 
	 * if we add higher than the max value of index it will show errror
	 * list.add(10, "akram");
		System.out.println(list);  */
		
		
		//if we add value in the already specified index it will automatically switched the specified index value in next index
		list.add(2, "rihan");
		System.out.println(list);
		
		
		//addAll Method-->
		System.out.println();
		List<String> list1 =new ArrayList<String>();
		list1.add(0, "irfan");
		list1.add(1,"salman");
		list1.add(2, "arbaz");
		System.out.println(list1);
		
		list.addAll(2,list1);
		System.out.println(list);
	}

}
