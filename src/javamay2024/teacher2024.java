package javamay2024;

import java.security.Principal;

public class teacher2024 extends Student implements Principal {
    private String department;
    private boolean isResigned;

    // Constructor
    public teacher2024(String name, int rollNumber, String department) {
        super(name, rollNumber);
        this.department = department;
        this.isResigned = false; // Default state
    }

    // Method to show teacher details, including department
    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Department: " + department);
        System.out.println("Resigned: " + isResigned);
    }

    // Method to handle department
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Implementing Principal interface methods
    @Override
    public void resign() {
        if (!isResigned) {
            isResigned = true;
            System.out.println(getName() + " has resigned from the position.");
        } else {
            System.out.println(getName() + " has already resigned.");
        }
    }

    @Override
    public void rejoin() {
        if (isResigned) {
            isResigned = false;
            System.out.println(getName() + " has rejoined the position.");
        } else {
            System.out.println(getName() + " is already in position.");
        }
    }
}