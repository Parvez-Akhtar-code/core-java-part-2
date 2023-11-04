package CollectionFrame;

import java.util.ArrayList;
import java.util.List;

public class ListGet_RemoveMethod {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add(0, "AAA");
		list.add(1, "BBB");
		list.add(2, "CCC");
		list.add(3, "DDD");
		System.out.println(list);
		
		System.out.println();
		//if we want to see a specific index value
	    System.out.println(list.get(2));
	    
	    System.out.println();
	    //if we want to remove a specific index value
	    System.out.println("index one value removed -->"+list.remove(1));
	   System.out.println(list);

	}

}
