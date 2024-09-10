package Tuition;
import java.util.Scanner;
public class colours {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the codes :");
		int codes=s.nextInt();
		
		if(codes==1)
			 System.out.println("Violet");
		else if(codes==2)
			    System.out.println("Indigo");
		     else if(codes==3)
			         System.out.println("blue");
		          else if (codes==4)
		                   System.out.println("green");
		               else if (codes==5)
		                        System.out.println("yellow");
	                    	else if (codes==6)
			                         System.out.println("orange");
		                         else 
			                         System.out.println("red");
		
		

	}

}
