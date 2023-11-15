package CollectionFrame;

import java.util.TreeSet;

class Employee implements Comparable<Employee>{
	int eno;
	String ename;
	String eadd;
	int esal;
	public Employee(int eno, String ename, String eadd, int esal) {
		this.eno = eno;
		this.ename = ename;
		this.eadd = eadd;
		this.esal = esal;
	}
	public int compareTo(Employee emp) {
		int val=0;
		try {
			val= this.ename.compareTo(emp.ename);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return val;
	}
	public String toString() {
		return "["+eno+","+ename+","+eadd+","+esal+"]\n";
	}
}
public class CompareToEx {
	public static void main(String[] args) {
	Employee emp1 = new Employee(111, "junaid", "jaipur",8000);
	Employee emp2 = new Employee(222, "waseem", "udaipur",6000);
	Employee emp3 = new Employee(333, "ayaan", "bhilwara",9000);
	Employee emp4 = new Employee(444, "emaan", "nagaur",5000);
	Employee emp5 = new Employee(555, "akram", "jodhpur",7000);
	TreeSet<Employee> ts = new TreeSet<Employee>();
	ts.add(emp5);
	ts.add(emp4);
	ts.add(emp2);
	ts.add(emp3);
	ts.add(emp1);
	System.out.println(ts);
	}

}
