package Controlstatements;

public class reversepgm {

	public static void main(String[] args) {
		int n=23456;
		int rev=0,r;
	//temp=n;
		while(n>0)     //23456>0   2345>0    234>0
		{
			r=n%10; //23456%10=6  2345%10=5 234%10=4
			rev=rev*10+r;//0=0+6  6=6*10+5=65  65=65*10+4=654
			n=n/10; //2345   //234  //23
		}
		{
			System.out.println("pallindrome number");
				
	
				System.out.println("not pallindrome");	
		
		
		

	}

}
}
