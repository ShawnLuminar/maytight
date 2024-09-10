package assignment;

public class largestnumber {

    // Method to find the largest number in an array
    public static int findLargest(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int max = array[0]; // Assume the first element is the largest initially

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, -1, 4, 10, 12};
        int largest = findLargest(numbers);
        System.out.println("The largest number in the array is: " + largest);
    }
}
