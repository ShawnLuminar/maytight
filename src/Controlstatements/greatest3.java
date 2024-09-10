package Controlstatements;

public class greatest3 {

	public static void main(String[] args) 
	{
		int a=20,b=30,c=10;
		if (a>b)
		  {
			if (a>c)
				System.out.println("the greatest number is " + a);
			else
			    System.out.println("the greatest number is " + c);
		 }
		else
		   {
			if (b>c)
				System.out.println("the greatest number is " + b);
			else
				System.out.println("the greatest number is " + c);
		   }
		
		
	/*	int a=20,b=30,c=10;
		int g=0;
		if (a>b && a>c)
	    	g=a;
		if (b>a && b>c)
			g=b;
		if (c>a && c>b)
			g=c;
		System.out.println("the greatest number is " + g);  */
		
		
		
		

	}

}
