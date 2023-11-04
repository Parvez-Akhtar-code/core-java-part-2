package CollectionFrame;

import java.util.ArrayList;

public class containsMethod {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("parvez");
		al1.add("junaid");
		al1.add("anwar");
		al1.add("ayan");
		al1.add("rihan");
		System.out.println(al1);
		
		System.out.println(al1.contains("anwar"));
		
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("parvez");
		al2.add("junaid");
		System.out.println(al2);
		System.out.println(al1.containsAll(al2));
		
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("parvez");
		al3.add("junaid");
		al3.add("akram");
		System.out.println(al3);
		System.out.println(al1.containsAll(al3));

	}

}
