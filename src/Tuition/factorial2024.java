package Tuition;

import java.util.Scanner;

public class factorial2024 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number : ");
		int a=s.nextInt();
        int f=1;
       
		for(int i=1;i<=a;i++) {
			f=f*i;
			
		}
		System.out.println("the factorial of " + a +  "is" +  f);
	}
        
	}


