package Tuition;
import java.util.Scanner;
public class p2 
   {
	public static void main(String[]args) 
	 {
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter a number : ");
		int a = s.nextInt();
		System.out.println(" Enter a another number ");
		int b = s.nextInt();
		
		if(a==b)
		{
			System.out.println(" Both numbers are equal : ");
		}
		else
		{
			System.out.println(" Both numbers are not equal : ");
		}
	}

}
