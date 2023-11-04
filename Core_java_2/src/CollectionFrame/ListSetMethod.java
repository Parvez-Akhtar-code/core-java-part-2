package CollectionFrame;

import java.util.ArrayList;
import java.util.List;

public class ListSetMethod {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add(0, "parvez");
		list.add(1, "irfan");
		list.add(2, "salman");
		list.add(3,"anwar");
		System.out.println(list);
		
		/* Set method in list --> if we add value next to the max value of index it will show error 
		list.set(4, "akram");
		System.out.println(list); */
		
		//if we use set method in existing index value it will no adjust the value in next index it simply override/replace the value
		list.set(2, "junaid");
		System.out.println(list);
	}

}
