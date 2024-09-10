package Controlstatements;

public class rrrr {

	
		 public static int factorialIterative(int n) {
		        if (n < 0) {
		            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
		        }
		        int result = 1;
		        for (int i = 1; i <= n; i++) {
		            result *= i;
		        }
		        return result;
		    }

		    public static int factorialRecursive(int n) {
		        if (n < 0) {
		            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
		        }
		        if (n == 0 || n == 1) {
		            return 1;
		        }
		        return n * factorialRecursive(n - 1);
		    }

		    public static String reverseString(String s) {
		        return new StringBuilder(s).reverse().toString();
		    }

		    public static void main(String[] args) {
		        int number = 5;
		        System.out.println("The factorial of " + number + " (iterative) is: " + factorialIterative(number));
		        System.out.println("The factorial of " + number + " (recursive) is: " + factorialRecursive(number));

		        String inputString = "Hello";
		        System.out.println("The reverse of '" + inputString + "' is: '" + reverseString(inputString) + "'");
		    }
		}