package CollectionFrame;

import java.util.Comparator;
import java.util.TreeSet;

class Student{
	int srno;
	String sname;
	String sadd;
	int sfees;
	public Student(int srno, String sname, String sadd, int sfees) {
		this.srno = srno;
		this.sname = sname;
		this.sadd = sadd;
		this.sfees = sfees;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+srno+","+sname+","+sadd+","+sfees+"]\n";
	}
	
}

class MyComparator1 implements Comparator<Student>{
	@Override
	public int compare(Student str1, Student str2) {
		int val;
		return val = str1.sname.compareTo(str2.sname);
	}
}


public class ComparatorEx2 {

	public static void main(String[] args) {
		Student st1 = new Student(111, "parvez", "jaipur", 8000);
		Student st2 = new Student(222, "salim", "udaipur", 6000);
		Student st3 = new Student(333, "akram", "didwana", 4000);
		Student st4 = new Student(444, "junaid", "nagaur", 10000);
		Student st5 = new Student(555, "amir", "jodhpur", 6000);
		MyComparator1 mc1 =  new MyComparator1();
		TreeSet<Student> ts = new TreeSet<Student>(mc1);
		ts.add(st1);
		ts.add(st2);
		ts.add(st3);
		ts.add(st4);
		ts.add(st5);
		System.out.println(ts);
	}

}
