package Controlstatements;

public class digit2024 {

	public static void main(String[] args) {
		int number=1234;
		int reversednumber=0;
		while (number !=0) {
			int digit = number % 10;
			reversednumber= reversednumber * 10 + digit;
			number /=10;
		}
        System.out.println("reversed number:" + reversednumber);
	}

}
