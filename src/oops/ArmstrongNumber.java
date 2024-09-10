package oops;
import java.util.Scanner;

public class ArmstrongNumber {

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        // Find the number of digits in the number
        int originalNumber = number;
        int numberOfDigits = String.valueOf(number).length();
        int sum = 0;

        // Calculate the sum of each digit raised to the power of numberOfDigits
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }

        // Check if the sum is equal to the original number
        return sum == originalNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is an Armstrong number
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }
}