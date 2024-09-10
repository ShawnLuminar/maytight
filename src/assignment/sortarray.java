package assignment;

import java.util.Arrays;

public class sortarray {

    // Method to sort the array in ascending order
    public static void sortArray(int[] array) {
        if (array == null || array.length == 0) {
            return; // Nothing to do for null or empty array
        }

        Arrays.sort(array); // Sort the array in ascending order
    }

    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, -1, 4, 10, 12};
        System.out.println("Original array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        sortArray(numbers);

        System.out.println("\nSorted array in ascending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}