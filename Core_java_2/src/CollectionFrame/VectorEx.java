package CollectionFrame;

import java.util.ArrayList;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		System.out.println(v.capacity());//10
		
		for(int i=1;i<=11;i++) {
			v.add(i);
		}
		
		
		/* it will increase his internal size by 2*currentSize formula */
		
		
		System.out.println(v.capacity());//20
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("AAA");
		al.add("BBB");
		al.add("CCC");
		al.add("DDD");
		
		Vector<String> v1 = new Vector<String>(al);
		System.out.println(v1);

	}

}
