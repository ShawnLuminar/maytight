package Controlstatements;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Read the input as a String

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();  // Read the input as an integer

        // Display the input received
        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        // Close the scanner to free up resources
        scanner.close();
    }

	public static void main(int i, int j, int k) {
		// TODO Auto-generated method stub
		
	}

	public int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}
}