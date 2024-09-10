package Tuition;

import java.util.Scanner;

public class numbers 
{

	public static void main(String[] args)
	{
	
		Scanner s = new Scanner(System.in);
	    
		System.out.println("The first number  : ");
		int a = s.nextInt();
		System.out.println("The second number  : ");
		int b = s.nextInt();
		System.out.println("The Third number  : ");
		int c = s.nextInt();
			
		if(a>b)
		   {
			  if(a>c)
			       {
				      System.out.println("Greatest number is " + a);
			       }
			  else
			       {
			          System.out.println("Greatest number is " + c);	
		            }
		   }  
		
		else
			{
		     if (b>c)
		      {
		    	 System.out.println("Greatest number is " + b);
	          }
		     else
		        {
		    	 System.out.println("Greatest number is " + c);
		        }
	         }
	}
		
	}	
		
		
		
		
		