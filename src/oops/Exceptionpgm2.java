package oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptionpgm2 {

    public static void main(String[] args) {
        FileInputStream file = null;
        try {
            // Code that might throw an exception
            file = new FileInputStream("E://Book.xlsx");
            System.out.println("File opened successfully");
            // Simulate some processing
            Thread.sleep(5000);
            System.out.println("Processing completed");
        } catch (FileNotFoundException e) {
            // Handle FileNotFoundException
            System.out.println("File not found: " + e.getMessage());
        } catch (InterruptedException e) {
            // Handle InterruptedException
            System.out.println("Thread interrupted: " + e.getMessage());
        } catch (IOException e) {
            // Handle other IOExceptions
            System.out.println("I/O error: " + e.getMessage());
        } finally {
            // This block will always execute
            System.out.println("Finally block executed");
            if (file != null) {
                try {
                    file.close();
                    System.out.println("File closed successfully");
                } catch (IOException e) {
                    System.out.println("Error closing file: " + e.getMessage());
                }
            }
        }
    }
}