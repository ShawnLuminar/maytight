package Controlstatements;

public class swap {

	public static void main(String[] args) {
		int a=25;
		int b=23;
		System.out.println("numbers before swapping"+a +" "+b);
		a=a+b;//25+23=48
		b=a-b;//48-23=25
		a=a-b;//48-25=23
		System.out.println("numbers after swapping " +a + " " +b);

	}

}
