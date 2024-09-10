package Controlstatements;

public class swapvariables {

	public static void main(String[] args) {
		int a=25;
        int b=23;
        System.out.println("before swapping:a="+a+",b="+b);
        //swap logic using a temporary variable
        int temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping:a="+a+",b="+b);
	}

}
