package CollectionFrame;

import java.util.ArrayList;

public class removeMethod {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("parvez");
		al1.add("junaid");
		al1.add("anwar");
		System.out.println(al1);
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("parvez");
		al1.removeAll(al2);
		System.out.println(al1);
		al1.remove("anwar");
		System.out.println(al1);

	}

}
