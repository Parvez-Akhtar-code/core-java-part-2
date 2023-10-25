package MultiThreading;

class welcomeThread extends Thread{
	public void run() {
		for(int i=0; i<10;i++) {
			System.out.println("welcome thread : "+i);
		}
	}
	
}

public class FAthread {

	public static void main(String[] args) {
		welcomeThread wt = new welcomeThread();
		wt.start();
		for(int i = 0; i<10;i++) {
			System.out.println("main thread : "+i);
		}

	}

}
