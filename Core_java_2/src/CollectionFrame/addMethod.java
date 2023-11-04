package CollectionFrame;

import java.util.HashSet;

public class addMethod {

	public static void main(String[] args) {
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("parvez");
		hs1.add("junaid");
		hs1.add("anwar");
		System.out.println(hs1);
		
		HashSet<String> hs2 =  new HashSet<String>();
		hs2.add("ayan");
		hs2.add("rihan");
		hs2.add("almir");
		hs1.addAll(hs2);
		System.out.println(hs1);
	}

}
