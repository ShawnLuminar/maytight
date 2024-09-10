package Tuition;

import java.io.PrintStream;

public class declainitiaodrderevaluationtypeconversionmodularoperationlogicaloperators {
	public static void main(String[] args)  {
		//declaration and initialization
		int a=10,b=5,c=8,d=2;
		float x=6.00f,y=3.00f;
		
		//order evaluation
		int answer1=a*b+c/d;
		int answer2=a*(b+c)/d;
		
		//type conversion
		float answer3=a/c;
		float answer4=(float)a/c;
		float answer5=a/y;
		
		//modulus operation
		int answer6=a%c;
		float answer7=a%d;
		
		//logical operators
		boolean bool1=a>b && c>d;
		boolean bool2=a<b && c>d;
		boolean bool3=a<b || c>d;
		boolean bool4=!(a-b==c);
		
		System.out.println("order evaluation");
		System.out.println("a*b+c/d ="+ answer1);
		System.out.println("a*(b+c)/d = "+ answer2);
		
		System.out.println("type conversion");
		System.out.println("a/d ="+answer3);
		System.out.println("(float)a/d="+answer4);
		System.out.print("a/y =" + answer5);
		
		
		System.out.println("modulus operation");
		System.out.println("a%c ="+ answer6);
		System.out.println("a%d ="+ answer7);
		
		
		
		
		
		
		
		System.out.println("logical operators");
		System.out.println("a>b && c>d = " + bool1);
		System.out.println("a<b && c>d =" + bool2);
		System.out.println("a<b || c>d =" + bool3);
		System.out.println("!(a-b==c)"+ bool4);
		
	}
}
