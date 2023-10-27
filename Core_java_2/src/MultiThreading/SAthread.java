package MultiThreading;

class SecondThread implements Runnable{
	public void run() {
		for(int i =0; i<10; i++) {
			System.out.println("welcome thread "+i);
		}
	}
}


public class SAthread {

	public static void main(String[] args) {
		SecondThread st = new SecondThread();
		Thread td = new Thread(st);
		td.start();
		for(int i =0;i<=10;i++ ) {
			System.out.println("main thread "+i);
		}

	}

}
