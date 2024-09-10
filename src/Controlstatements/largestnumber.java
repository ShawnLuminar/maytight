package Controlstatements;

public class largestnumber {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int c = 10;
        
        int largest;
        
        if (a > b) {
            if (a > c) {
                largest = a;
            } else {
                largest = c;
            }
        } else {
            if (b > c) {
                largest = b;
            } else {
                largest = c;
            }
        }
        
        System.out.println("The largest number among " + a + ", " + b + ", and " + c + " is " + largest);
    }
}