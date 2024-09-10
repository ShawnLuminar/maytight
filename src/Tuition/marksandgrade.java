package Tuition;
import java.util.Scanner;
public class marksandgrade 

       {
        public static void main(String[] args) 
        {
		Scanner s=new Scanner(System.in);
		System.out.print("enter marks : ");
		int marks=s.nextInt();
		
		  if (marks>79)
			  System.out.println("honours");
		  else if(marks>59)
			  System.out.println("First Division");
		  else if(marks>49)
			  System.out.println("Second Division");
		  else if(marks>39)
			  System.out.println("Third Division");
		  else
			  System.out.println("fail");
		  
		
		
	   }

}
