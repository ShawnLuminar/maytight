package Controlstatements;

public class employee {
	String empname;
	int empid;
	String designation;
	int salary;
	
	public void display(){
		System.out.println(empname);
		System.out.println(empid);
		System.out.println(designation);
		System.out.println(salary);
	}
	public static void main(String[] args) {
		employee ob=new employee();
		ob.empname="anu";
		ob.empid=100;
		ob.designation="designer";
		ob.salary=30000;
		ob.display();		
	}

}



