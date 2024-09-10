package Controlstatements;

import java.util.Scanner;

public class circlearea {

	public static void main(String[] args) {
		Scanner sr=new Scanner (System.in);
		
		System.out.print("Enter the radius of the circle  :  ");
		double radius =sr.nextDouble();
		
		//calculate the area
		double area= 3.14 * radius*radius;
		
		System.out.println("The area of circle is:" + area);
		sr.close();
	
	
		

	}

}
