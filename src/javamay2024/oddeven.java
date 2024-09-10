package javamay2024;
public class oddeven {
    public static void main(String[] args) {
        // Define the array of integers
        int[] numbers = {12, 7, 9, 22, 15, 30, 17, 5};
        
        // Print even numbers
        System.out.println("Even numbers:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
        
        // Print odd numbers
        System.out.println("Odd numbers:");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }
}