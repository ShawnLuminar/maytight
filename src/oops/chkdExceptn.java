package oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class chkdExceptn {

    public static void main(String[] args) {
        try {
            FileInputStream f = new FileInputStream("E://Book.xlsx");
            System.out.println("STARTED");
            Thread.sleep(5000);
            System.out.println("stopped");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        }
    }
}