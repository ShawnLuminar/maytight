package Tuition;
import java.util.Scanner;
public class classtests {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the rollno: ");
		int Rollno=s.nextInt();
		System.out.println("enter your name: ");
		String Name=s.next();
		
        System.out.println("enter the fees: ");
        double Fees=s.nextInt();
        System.out.println("\nrollno  :  "+ Rollno+"\nname  :  "+Name+"\nfees  :  "+ Fees);
        s.close();
        
	}

}
