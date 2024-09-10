package Controlstatements;

public class methodoverloading2024 {
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public void add(int a, double b)
	{
		double value=a+b;
		System.out.println(value);
	}
	     public static void main(String[] args) {
	    	 methodoverloading2024 ob=new methodoverloading2024();
	    	    ob.add(5,  6);
	    	    ob.add(4,  6.6);
	     }

}
