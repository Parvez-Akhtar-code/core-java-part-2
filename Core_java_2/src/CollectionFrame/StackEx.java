package CollectionFrame;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		s.push("AAA");
		s.push("BBB");
		s.push("CCC");
		s.push("DDD");
		s.push("EEE");
		
		//stack follows LIFO(Last in First Out) so his last element will be indexed 1
		System.out.println(s);
		System.out.println();
		
		//if we use pop method then his 1 indexed value that mean EEE will be removed
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println();
		
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println();
		
		System.out.println(s.search("BBB"));
		System.out.println(s);

	}

}
