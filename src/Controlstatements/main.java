package Controlstatements;

public class main {

	public static void main(String[] args) {
		//part a
		//check if 23 and 45 are equal
		int num1=23,num2=45;
		if(num1 == num2)
		   System.out.println("The nos 23 and 45 are equal");
		else
			System.out.println("the numbers 23 and 45 are not equal");
		
		int a=55,b=70;
		if (a>50 && a<b)
	        System.out.println("true");
		else
			System.out.println("false");
		//part b
		int c=70,sd;
		sd=(c/10)%10;
		System.out.println("second digit of" + c + " is "+ sd);
		
		
		

	}

}
