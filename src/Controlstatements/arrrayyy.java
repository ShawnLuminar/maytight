package Controlstatements;

import java.util.Scanner;

public class arrrayyy {public static void main(String[] args) {
	int arr[]=new int[3];
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the numbers");
	for(int i=0;i<3;i++)
	{
		arr[i]=sc.nextInt();
		
	}
	System.out.println("the numbers are:");
	for (int s:arr)//2345
	{
		System.out.println(s);
	}

}

}



