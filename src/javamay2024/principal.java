package javamay2024;

import java.security.Principal;

public interface principal{
	void resign();
    void unresign();
    void join();

}
class Student {
    private String name;
    private int rollNumber;
	private Object "Student;

    // Constructor
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void join() {
		
		=
		System.out.print("Student is joining");
		
	}

	public void unresign() {
		// TODO Auto-generated method stub
		
	}

	public void resign() {
		// TODO Auto-generated method stub
		
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
    public class Teacher extends Student implements Principal {
        private String department;

        // Constructor
        public Teacher(String name, int rollNumber, String department) {
            super(name, rollNumber);
            this.department = department;
        }

        // Getters and Setters
        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        // Implementation of Principal interface methods
        @Override
        public void resign() {
            System.out.println(getName() + " has resigned from the position.");
        }

        @Override
        public void unresign() {
            System.out.println(getName() + " has unresigned and is back in the position.");
        }

        @Override
        public void join() {
            System.out.println(getName() + " has joined the position in the " + department + " department.");
        }

        // To String method
        @Override
        public String toString() {
            return "Teacher [name=" + getName() + ", rollNumber=" + getRollNumber() + ", department=" + department + "]";
        }
    }
	public void showDetails() {
		// TODO Auto-generated method stub
		
	}

	public void rejoin() {
		// TODO Auto-generated method stub
		
	}
}
