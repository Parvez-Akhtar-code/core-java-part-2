package MultiThreading;

class A {
	void increment() {
		int i=10;
		i=i+10;
		System.out.println(Thread.currentThread()+" " +i);
	}
}

class thread1 extends Thread{
	A a;
	thread1(A a){
		this.a=a;
	}
	public void run(){
	a.increment();
	}
}

class thread2 extends Thread{
	A a;
	thread2(A a){
		this.a=a;
	}
	public void run(){
	a.increment();
	}
}


public class TSResources1 {

	public static void main(String[] args) {
		A a = new A();
		thread1 t1 = new thread1(a);
		thread2 t2 = new thread2(a);
		t1.start();
		t2.start();

	}

}
