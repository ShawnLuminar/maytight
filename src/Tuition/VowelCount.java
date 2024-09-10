package Tuition;
public class VowelCount {

    // Method to count vowels in a string
    public static int countVowels(String str) {
        if (str == null || str.isEmpty()) {
            return 0; // Return 0 if the string is null or empty
        }

        int count = 0;
        // Convert the string to lowercase to handle both uppercase and lowercase vowels
        str = str.toLowerCase();

        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int vowelCount = countVowels(input);

        System.out.println("Number of vowels in the string: " + vowelCount);

        scanner.close();
    }
}