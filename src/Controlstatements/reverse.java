package Controlstatements;

public class reverse {

	public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        String inputString = "Hello";
        System.out.println("The reverse of '" + inputString + "' is: '" + reverse(inputString) + "'");
    }
}