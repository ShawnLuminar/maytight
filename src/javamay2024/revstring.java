package javamay2024;

public class revstring {

	public static void main(String[] args) {
String originalString = "Hello, World!";
        
        // Reverse the string
        String reversedString = new StringBuilder(originalString).reverse().toString();
        
        // Print the reversed string
        System.out.println("Original string: " + originalString);
        System.out.println("Reversed string: " + reversedString);
    }
}




