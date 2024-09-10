package Tuition;

import java.util.Scanner;

public class agelimit {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);{
		
		System.out.println("Enter the age of the member : ");
		int Age=sc.nextInt();
		System.out.println("Enter the name of the member : ");
		String Name=sc.next();
		if (Age>=18)
			System.out.println("Hai " +Name +" : you are eligible to vote");
		else
			System.out.print("Hai child " + Name + " : NOT eligible to vote");
	}
	}
}
		
