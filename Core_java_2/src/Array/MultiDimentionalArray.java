package Array;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		int[][] a = {{1,2,3,4} , {5,6,7,8}};
		for(int row=0; row<a.length; row++) {
			for(int col=0; col<a[row].length; col++) {
				System.out.print(a[row][col]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		int[][] b= {{11,22,33,44} , {55,66,77,88}};
		
		for(int[] row : b) {
			for(int val : row) {
				System.out.print(val+" ");
			}
			System.out.println();
		}

	}

}
