package javamay2024;

public class student2024 {
	public interface Principal {
	    void resign();
	    void rejoin();
	}
	class Student {
	    private String name;
	    private int rollNumber;
	    private int marks;

	    // Constructor
	    public Student(String name, int rollNumber) {
	        this.name = name;
	        this.rollNumber = rollNumber;
	        this.marks = 0; // Default marks
	    }

	    // Method to set marks
	    public void setMarks(int marks) {
	        this.marks = marks;
	    }

	    // Method to show student details
	    public void showDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Roll Number: " + rollNumber);
	        System.out.println("Marks: " + marks);
	    }

	    // Getters and Setters
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getRollNumber() {
	        return rollNumber;
	    }

	    public void setRollNumber(int rollNumber) {
	        this.rollNumber = rollNumber;
	    }

	    public int getMarks() {
	        return marks;
	    }
	}
}
