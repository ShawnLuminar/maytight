package Controlstatements;
//default constructor
public class empconstructor 
{     //define instance variables
	      int empid;
	      int salary;
	      String designation;
	      public empconstructor(int id,int sal,String design)
	      {
	        empid=id;
	        salary=sal;
	        designation=design;
	        
	      }
	      public static void main(String[] args) {
	        empconstructor ob=new empconstructor(100,40000,"tester");
	        System.out.println("id = "+ob.empid);
	        System.out.println("salary = "+ob.salary);
	        System.out.println("designation = "+ob.designation);
}
}
