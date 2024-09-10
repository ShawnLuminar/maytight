package Controlstatements;
public class seconddigit{
    public static void main(String[] args) {
        int c = 70;
        
        String cStr = Integer.toString(c);
        if (cStr.length() >= 2) {
            char secondDigit = cStr.charAt(1);
            System.out.println("The second digit of " + c + " is " + secondDigit);
        } else {
            System.out.println("The number " + c + " does not have a second digit.");
        }
    }
}