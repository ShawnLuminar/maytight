package Controlstatements;

import java.util.Scanner;

public class arraypgm {

	public static void main(String[] args) {
		String arr[]=new String[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur names");
		for(int i=0;i<4;i++)
		{
			arr[i]=sc.next();
		}
		System.out.println("the names are:");
		for(String s:arr)
		{
			System.out.println(s);
		}

	}

}