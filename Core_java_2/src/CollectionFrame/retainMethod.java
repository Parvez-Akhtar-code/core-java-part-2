package CollectionFrame;

import java.util.ArrayList;

public class retainMethod {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("parvez");
		al1.add("junaid");
		al1.add("anwar");
		al1.add("jamshed");
		al1.add("aryan");
		System.out.println(al1);

		//retain all method for retaining those entities that are mentioned in this collection
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("parvez");
		al2.add("junaid");
		al2.add("anwar");
		System.out.println(al2);
		System.out.println(al1.retainAll(al2));
		System.out.println(al1);
		
		System.out.println();
		
		//if all entities are same then it will return false
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("parvez");
		al3.add("junaid");
		al3.add("anwar");
		System.out.println(al3);
		System.out.println(al1.retainAll(al3));
		System.out.println(al1);
		
		System.out.println();
		//for atleast one entity it will return
		ArrayList<String> al4 = new ArrayList<String>();
		al4.add("parvez");
		al4.add("aman");
		al4.add("jamil");
		System.out.println(al4);
		System.out.println(al1.retainAll(al4));
		System.out.println(al1);
	}

}
