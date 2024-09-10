package Controlstatements;

public class samplearithmetic {

	public static void main(String[] args) {
		 int number = 1234;

	        // Print the number
	        System.out.println("The number is: " + number);

	        // Convert number to String
	        String numberString = Integer.toString(number);
	        System.out.println("The number as a string is: " + numberString);

	        // Convert String back to number
	        int convertedNumber = Integer.parseInt(numberString);
	        System.out.println("The converted number is: " + convertedNumber);

	        // Arithmetic operations
	        int sum = number + 100;
	        int product = number * 2;
	        System.out.println("Sum: " + sum);
	        System.out.println("Product: " + product);

	        // Split the number into digits
	        System.out.println("Digits:");
	        for (char digit : numberString.toCharArray()) {
	            System.out.println(digit);
	        }

	        // Reverse the digits
	        int reversedNumber = 0;
	        int tempNumber = number;
	        while (tempNumber != 0) {
	            int digit = tempNumber % 10;
	            reversedNumber = reversedNumber * 10 + digit;
	            tempNumber /= 10;
	        }
	        System.out.println("Reversed Number: " + reversedNumber);
	}
}
