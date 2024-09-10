package basics;

public class unaryop {

	public static void main(String[] args) {
	    int a=55;
	    System.out.println(a);
		int b;
		b=a;
		System.out.println(b);
		b+=a;
		//b=b+a
		//b=55+55
		System.out.println(b);
		b-=a;
		//b=b-a
		//110-55=55
		System.out.println(b);
		//b=55 a=55
       // b=55*55=3025
	  //  b=3025 a=55
	 //   b=b*a;
	 b*=a;
	 System.out.println(b);
	 b/=a;
	 System.out.println(b);
	 //b=b/a 3025/55=55

	}

}
