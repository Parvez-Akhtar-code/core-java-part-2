package Array;

public class SIngleDimentionalArray {

	public static void main(String[] args) {
		
		int[] a = {10,20,30,40,50};
		int i = 0;
		while(i<a.length) {
			System.out.println(a[i]);
			i++;
		}
		System.out.println();
		
		int[] b= {10,20,30,40,50};
		for(int j=0; j<b.length;j++) {
			System.out.println(a[j]);
		}
		System.out.println();
		
		int[] c= {10,20,30,40,50};
		for(int e:c) {
			System.out.println(e);
		}

	}

}
