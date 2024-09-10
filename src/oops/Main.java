package oops;
// Base class
class Member {
    String name;
    int age;
    String address;
    double salary;

    // Constructor
    public Member(String name, int age, String address, double salary) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
    }

    // Method to print details
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
    }
}

// Worker class inheriting Member class
class Worker extends Member {
    String specialization;

    // Constructor
    public Worker(String name, int age, String address, double salary, String specialization) {
        super(name, age, address, salary);
        this.specialization = specialization;
    }

    // Overriding printDetails method
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Specialization: " + specialization);
    }
}

// Manager class inheriting Member class
class Manager extends Member {
    String department;

    // Constructor
    public Manager(String name, int age, String address, double salary, String department) {
        super(name, age, address, salary);
        this.department = department;
    }

    // Overriding printDetails method
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Department: " + department);
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Creating an object of Worker
        Worker worker = new Worker("John Doe", 25, "123 Main St", 50000, "Electrical");
        System.out.println("Worker Details:");
        worker.printDetails();

        // Creating an object of Manager
        Manager manager = new Manager("Jane Smith", 40, "456 Elm St", 80000, "HR");
        System.out.println("\nManager Details:");
        manager.printDetails();
    }
}
