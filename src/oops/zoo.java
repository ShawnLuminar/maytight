package oops;
interface BasicAnimal {
    void eat();
    void sleep();
}

// Define the Monkey class
class Monkey {
    void jump() {
        System.out.println("Monkey is jumping");
    }

    void bite() {
        System.out.println("Monkey is biting");
    }
}

// Define the Human class that inherits from Monkey and implements BasicAnimal
class Human extends Monkey implements BasicAnimal {
    void speak() {
        System.out.println("Human is speaking");
    }

    // Implementing the methods from BasicAnimal interface
    public void eat() {
        System.out.println("Human is eating");
    }

    public void sleep() {
        System.out.println("Human is sleeping");
    }
}

// Main class to test the implementation
public class zoo {
    public static void main(String[] args) {
        Human human = new Human();
        
        // Calling methods from Monkey class
        human.jump();
        human.bite();
        
        // Calling method from Human class
        human.speak();
        
        // Calling methods from BasicAnimal interface
        human.eat();
        human.sleep();
    }
}