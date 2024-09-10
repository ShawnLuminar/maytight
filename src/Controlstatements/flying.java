package Controlstatements;

public class flying {

	public static void main(String[] args) {
		int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%2d * %2d = %2d\n", i, j, i * j);
            }
            System.out.println(); // Add a newline after each row
        }
    }
}