package MultiThreading;


class Ab {
	String str1="par";
	void add() {
		String str2 = str1.concat("vez");
		System.out.println(Thread.currentThread()+" "+str2);
	}
}
 class Thread11 extends Thread {
	 Ab ab;
	 Thread11(Ab ab){
		 this.ab= ab;
		 }
	 public void run() {
	 ab.add();
	 }
	 
 }
 class Thread22 extends Thread {
	 Ab ab;
	 Thread22(Ab ab){
		 this.ab= ab;
		 }
	 public void run() {
	 ab.add();
	 }
 }

public class TSResources2 {

	public static void main(String[] args) {
		Ab ab = new Ab();
		Thread11 t1 = new Thread11(ab);
		Thread22 t2 = new Thread22(ab);
		t1.start();
		t2.start();

	}

}
