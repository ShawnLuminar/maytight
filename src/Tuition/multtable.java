package Tuition;
import java.util.Scanner;
public class multtable {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Multiplicant  : ");
		int n = s.nextInt();
		System.out.println("Enter the limit   :  ");
		int limit = s.nextInt();
		System.out.println("MULTIPLICATION TABLE OF " + n);
		
		for(int i=1;i<=limit;i++)
		{
			System.out.println(n + " X " + i + " = " + n*i);
		}

	}

}
