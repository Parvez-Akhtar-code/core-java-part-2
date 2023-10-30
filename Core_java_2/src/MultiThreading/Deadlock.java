package MultiThreading;

class RegisterCourse extends Thread{
	Object CourseName;
	Object TrainerName;
	 
	RegisterCourse(Object CourseName , Object TrainerName ) {
		this.CourseName = CourseName;
		this.TrainerName = TrainerName;
		// TODO Auto-generated constructor stub
	}
	
	public void run() {
		synchronized (CourseName) {
			System.out.println("register course holds coursename");
			
		} 
		synchronized (TrainerName) {
		System.out.println("register course holds both coursename and trainername");	
		}
	}
	
}

class CancelCourse extends Thread{
	Object CourseName;
	Object TrainerName;
	 
	CancelCourse(Object CourseName , Object TrainerName ) {
		this.CourseName = CourseName;
		this.TrainerName = TrainerName;
		// TODO Auto-generated constructor stub
	}
	public void run() {
		
		synchronized (TrainerName) {
		System.out.println("cancel course holds both coursename and trainername");	
		}
		synchronized (CourseName) {
			System.out.println("cancel course holds coursename");
			
		} 
	}
}



public class Deadlock {

	public static void main(String[] args) {
		Object CourseName = new Object();
		Object TrainerName = new Object();
		
		RegisterCourse rc = new RegisterCourse(CourseName, TrainerName);
		CancelCourse cc = new CancelCourse(CourseName, TrainerName);
		
		rc.start();
		cc.start();
		

	}

}
