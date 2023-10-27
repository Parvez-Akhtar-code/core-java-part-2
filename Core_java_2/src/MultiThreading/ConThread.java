package MultiThreading;

public class ConThread {

	public static void main(String[] args) {
		Runnable r = new Thread();
		ThreadGroup tg = new ThreadGroup("Java");
		Thread t = new Thread(tg,r,"core java");
		System.out.println(t);

	}

}
