package CollectionFrame;

import java.util.ArrayList;

public class Methods {

	public static void main(String[] args) {

		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("parvez");
		al1.add("junaid");
		al1.add("anwar");
		System.out.println(al1);
		System.out.println(al1.size());
		
		System.out.println();
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("akram");
		al2.add("jalal");
		al2.add("salim");
		System.out.println(al2);
		System.out.println(al1.isEmpty());
		
		System.out.println();
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("irfan");
		al3.add("salman");
		al3.add("arbaj");
		System.out.println(al3);
		System.out.println(al3.isEmpty());
		al3.clear();
		System.out.println(al3);
		System.out.println(al3.isEmpty());
	}

}
