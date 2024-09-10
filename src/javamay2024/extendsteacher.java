package javamay2024;

public class extendsteacher {

    private String department;

    // Constructor
    public void Teacher(String name, int rollNumber, String department) {
        super(name, rollNumber);
        this.department = department;
    }

    // Method to show teacher details, including department
    public void showDetails() {
        super.showDetails();
        System.out.println("Department: " + department);
    }

    // Getters and Setters
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
