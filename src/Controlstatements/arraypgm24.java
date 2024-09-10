package Controlstatements;

import java.util.Scanner;

public class arraypgm24 {

	public static void main(String[] args) {
		int arr[]=new int[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		for(int i=0;i<4;i++)
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
