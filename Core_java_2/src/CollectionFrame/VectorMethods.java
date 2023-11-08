package CollectionFrame;

import java.util.Vector;

public class VectorMethods {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.addElement("AAA");
		v.addElement("BBB");
		v.addElement("CCC");
		v.addElement("DDD");
		v.addElement("EEE");
		System.out.println(v);
		
		System.out.println(v.firstElement());//AAA
		System.out.println(v.lastElement()); //EEE
		
		System.out.println(v.elementAt(3));//DDD
		
		v.removeElement("AAA");
		System.out.println(v);
		
		System.out.println(v.removeElement("BBB"));
		System.out.println(v);

	}

}
