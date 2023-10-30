package MultiThreading;

class F {
	boolean flag=true;
	int count=0;
	 public synchronized void produce() {
		 try {
			while(true) {
				if(flag==true) {
					count++;
					System.out.println("producer produced product : "+count );
					flag = false;
					notify();
					wait();
				}
				else {
					wait();
				}
			}
			 
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	 }
	 
	 public synchronized void consume() {
		 try {
			while(true) {
				if(flag==true) {
					wait();
				} else {
					System.out.println("consumer consume product : "+count);
					flag=true;
					notify();
					wait();
				}
			}
		} catch (Exception e) {
		e.printStackTrace();
		}
	 }
	
}

class Producer extends Thread{
	F f;
	public Producer(F f) {
		// TODO Auto-generated constructor stub
		this.f = f;
		
	}
  public void run() {
	  f.produce();
  }
}

class Consumer extends Thread{
	F f;
	public Consumer(F f) {
		this.f = f;
		
	}
	public void run() {
		f.consume();
	}
}

public class Producer_Consumer {
	public static void main(String[] args) {
		F f = new F();
		Producer p = new Producer(f);
		Consumer c = new Consumer(f);
		
		p.start();
		c.start();
	}

}
