package Controlstatements;

import java.util.Scanner;

public class syst {

	public static void main(String[] args) {
		 // Initializing a 2D array
        int a[][] = {
            {10, 20},
            {30, 40},
            {10, 12}
        };

        // Iterating over each row in the 2D array
        for (int[] i : a) {
            // Iterating over each element in the row
            for (int j : i) {
                // Printing each element followed by a space
                System.out.print(j + " ");
            }
            // Printing a new line after each row
            System.out.println();
        }
    }
}