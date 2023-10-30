package MultiThreading;

class D {
	void m1() {
		System.out.println("before synch "+Thread.currentThread().getName());
		synchronized (this) {
			for(int i=1; i<=5; i++) {
			System.out.println("after synch "+Thread.currentThread().getName());
		}
	}
}
}

class DisThread extends Thread{
	D d;
	public DisThread(D d) {
		this.d =d;
	
	}
	public void run() {
		d.m1();
	}
}


public class SynchByBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d = new D();
		DisThread dt1 = new DisThread(d);
		DisThread dt2 = new DisThread(d);
		DisThread dt3 = new DisThread(d);
		
		dt1.setName("AAA");
		dt2.setName("BBB");
		dt3.setName("CCC");
		
		dt1.start();
		dt2.start();
		dt3.start();
		
		
	}

}
