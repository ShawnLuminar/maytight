package javamay2024;

import java.util.Scanner;

public class Classroom {
    // Data members
    private int rollNo;
    private String name;
    private int marks;

    // Method to store values
    public void storeDetails(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Method to display the details
    public void undisplay() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create an object of the Classroom class
        Classroom student1 = new Classroom();

        // Store details in the object
        student1.storeDetails(1, "John Doe", 85);

        // Display the details
        student1.undisplay();
    }
}