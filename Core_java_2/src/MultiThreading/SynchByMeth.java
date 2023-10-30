package MultiThreading;

class thr {
	synchronized void display() {
	for(int i=1; i<=5;i++) {
		System.out.println(Thread.currentThread().getName());
	}
	}
}

class DisplayThread extends Thread{
	thr a;

	public DisplayThread(thr a) {
		this.a = a;
	}
	public void run() {
		a.display();
	}
	
}

public class SynchByMeth {
	public static void main(String[] args) {
		thr a = new thr();
		DisplayThread thread1 = new DisplayThread(a);
		DisplayThread thread2 = new DisplayThread(a);
		DisplayThread thread3 = new DisplayThread(a);
		thread1.setName("first");
		thread2.setName("second");
		thread3.setName("third");
		
		thread1.start();
		thread2.start();
		thread3.start();
	
	}
	

}
