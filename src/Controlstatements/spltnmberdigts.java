package Controlstatements;

public class spltnmberdigts {

	public static void main(String[] args) {
	int number=1234;
	String numberString=Integer.toString(number);
	for(char digit : numberString.toCharArray()) {
		System.out.println(digit);
	}

	}

}
