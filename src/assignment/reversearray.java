package assignment;

public class reversearray {

    // Method to reverse the array
    public static void reverseArray(int[] array) {
        if (array == null || array.length == 0) {
            return; // Nothing to do for null or empty array
        }

        int left = 0; // Start from the left end of the array
        int right = array.length - 1; // Start from the right end of the array

        while (left < right) {
            // Swap the elements at left and right
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move towards the center
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, -1, 4, 10, 12};
        System.out.println("Original array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        reverseArray(numbers);

        System.out.println("\nReversed array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}