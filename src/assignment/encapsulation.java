package assignment;

public class encapsulation {
    // Private fields
    private String name;
    private String designation;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for designation
    public String getDesignation() {
        return designation;
    }

    // Setter for designation
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public static void main(String[] args) {
        encapsulation ob = new encapsulation();
        ob.setName("Anusha");
        System.out.println(ob.getName());
        ob.setDesignation("Tester");
        System.out.println(ob.getDesignation());
    }
}