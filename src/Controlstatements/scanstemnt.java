package Controlstatements;

import java.util.Scanner;

public class scanstemnt {

	public static void main(String[] args) {
		double num1,num2,result;
		char op = 0 ;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter first number");
		       num1= sc.nextDouble();
		System.out.println("enter second number");
		num2 = sc.nextDouble();
		switch(op)
		{
		case '+':result=num1+num2;
		System.out.println(result);
		break;
		case '-':result=num1-num2;
		System.out.println(result);
		break;
		case '*':result=num1*num2;
		System.out.println(result);
		break;
		case '/':result=num1/num2;
		System.out.println(result);
		break;
		default:System.out.println("invalid operator");
		}

	}

}
