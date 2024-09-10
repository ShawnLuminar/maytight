package Controlstatements;

public class checkconditions {
    public static void main(String[] args) {
        int a = 55;
        int b = 70;
        
        if (a > 50 && a < b) {
            System.out.println("Both conditions a > 50 and a < b are true.");
        } else {
            System.out.println("Both conditions are not true.");
        }
    }
}