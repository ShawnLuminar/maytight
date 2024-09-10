package Tuition;

import java.util.Scanner;

public class switch2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the marks in english :");
		int e=s.nextInt();
		System.out.println("enter the marks in maths :");
		int m=s.nextInt();
		System.out.println("enter the marks in biology :");
		int b=s.nextInt();
		System.out.println("enter the marks in chemistry :");
		int c=s.nextInt();
		System.out.println("enter the marks in physics");
		int p=s.nextInt();
		int total=e+m+b+c+p;
		float per=total/6;
	    int index=(int)per/10;    
        System.out.println("total marks = " + total);
        System.out.println("percentage = " + per);
        System.out.println("grade = ");
        switch(index) 
        {
        case 10:
        case 9:
        case 8:
        	System.out.println("Honours");
        	break;
        case 7:
        case 6:
        	System.out.println("First division");
        	break;
        case 5:
        	System.out.println("second division");
        	break;
        case 4:
        	System.out.println("third division");
        	break;
        	default:
        		System.out.println("fail");
        		break;
        	
        	 
        }
        
        
        
        

	}

	
}

	
	


