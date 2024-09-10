package Controlstatements;

public class whilecount {

	public static void main(String[] args) {
		int n=1234;
		int count=0;
		while(n>0)
		{
			n=n/10;//123 //12 //1 //0
			count++;//1 //2 //3 //4
		}
         System.out.println(count);
	}

}
