package Project1;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class Employee{
	int empno;
	String ename;
	int esal;
	String eadd;
	public Employee(int empno, String ename, int esal, String eadd) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.esal = esal;
		this.eadd = eadd;
	}
	
	@Override
	public String toString() {
		return "["+empno+","+ename+","+esal+","+eadd+"]\n";
	}
	
	
}
class Mycomparator implements Comparator<Employee>{
	@Override
	public int compare(Employee emp1, Employee emp2) {
		int val=0;
		if(EmployeeSorting.sortingkey.equalsIgnoreCase("empno")) {
			val=emp1.empno-emp2.empno;
		}
		if(EmployeeSorting.sortingkey.equalsIgnoreCase("ename")) {
			val=emp1.ename.compareTo(emp2.ename);
		}
		if(EmployeeSorting.sortingkey.equalsIgnoreCase("esal")) {
			val=emp1.esal-emp2.esal;
		}
		if(EmployeeSorting.sortingkey.equalsIgnoreCase("eadd")) {
			val=emp1.eadd.compareTo(emp2.eadd);
		}
		if(EmployeeSorting.SortingOrder.equalsIgnoreCase("asc")) {
			return val;
		}
		else {
			return -val;
		}
	}
}

public class EmployeeSorting  {
	static String sortingkey = "";
	static String SortingOrder = "";
	public static void main(String[] args) throws Exception {
		Mycomparator mc = new Mycomparator();
		
		
		Scanner sc  = new Scanner(System.in);
		int option = 0;
		
		
		Employee emp1 = new Employee(111, "junaid", 10000, "jaipur");
		Employee emp2 = new Employee(222, "almir", 14000, "jodhpur");
		Employee emp3 = new Employee(333, "salim", 30000, "nagaur");
		Employee emp4 = new Employee(444, "irfan", 22000, "didwana");
		Employee emp5 = new Employee(555, "zaid", 40000, "kkna");
		while(true) {
			System.out.println();
			System.out.println("Select a Option:----->");
			System.out.println("-------------------------");
			System.out.println("1.Sorting by employee number");
			System.out.println("2.Sorting by employee name");
			System.out.println("3.Sorting by employee salary");
			System.out.println("4.Sorting by employee address");
			System.out.println("5.Exit");
			System.out.println();
			System.out.print("Enter your option : ");
			option=sc.nextInt();
			if(option >0 && option <=4) {
				System.out.print("select order [asc/desc] : ");
				SortingOrder = sc.next();
			}
			
			switch (option) {
			case 1: {
				sortingkey="empno";
				break;
			}
			case 2: {
				sortingkey="ename";
				break;
			}
			case 3: {
				sortingkey="esal";
				break;
			}
			case 4: {
				sortingkey="eadd";
				break;
			}
			case 5: {
				System.out.println("Thanks for using this application");
				System.exit(0);
				break;
			}
			default :
				System.out.println("enter above numbers");
				break;
			
			
		}
			TreeSet<Employee> ts = new TreeSet<Employee>(mc);
			ts.add(emp1);
			ts.add(emp2);
			ts.add(emp3);
			ts.add(emp4);
			ts.add(emp5);
			System.out.println(ts);
		
	}
		

}
}
