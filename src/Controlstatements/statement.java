package Controlstatements;

public class statement {

	private static final String Multipleresp = null;

	public static void main(String[] args) {
		 int num1 = 40, num2 = 20, result = 0;
	        char op = '+';

	        switch (op) {
	            case '+':
	                result = num1 + num2;
	                System.out.println("Result: " + result);
	                break;

	            case '-':
	                result = num1 - num2;
	                System.out.println("Result: " + result);
	                break;

	            case '*':
	                result = num1 * num2;
	                System.out.println("Result: " + result);
	                break;

	            case '/':
	                if (num2 != 0) {
	                    result = num1 / num2;
	                    System.out.println("Result: " + result);
	                } else {
	                    System.out.println("Cannot divide by zero");
	                }
	                break;

	            default:
	                System.out.println("Invalid operator");
	                break;
	        }
	    }
	}