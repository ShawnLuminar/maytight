package Controlstatements;

public class rev9 {

	public static void main(String[] args) {
		 int n = 23456;
	        int originalNumber = n; // Store the original number for comparison later
	        int rev = 0, r;

	        while (n > 0) {
	            r = n % 10;      // Extract the last digit
	            rev = rev * 10 + r;  // Build the reversed number
	            n = n / 10;      // Remove the last digit from n
	        }

	        // Check if the reversed number equals the original number
	        if (originalNumber == rev) {
	            System.out.println(originalNumber + " is a palindrome number");
	        } else {
	            System.out.println(originalNumber + " is not a palindrome number");
	       }
	    }
}













