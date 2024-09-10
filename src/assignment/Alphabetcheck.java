package assignment;

import java.util.Scanner;

public class Alphabetcheck {

    // Method to check if a character is an alphabet
    public static boolean isAlphabet(char c) {
        return Character.isLetter(c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char input = scanner.next().charAt(0);

        if (isAlphabet(input)) {
            System.out.println("The entered character is an alphabet.");
        } else {
            System.out.println("The entered character is not an alphabet.");
        }

        scanner.close();
    }
}



