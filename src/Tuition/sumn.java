package Tuition;
import java.util.Scanner;
public class sumn {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a limit");
		int n=s.nextInt();
		int sum=0;
		for (int i=1;i<=n;i++) 
		{
			sum=sum+i;
			
		}
          System.out.println("sum of first " + n + "natural numbers is " + sum);
	}

}
