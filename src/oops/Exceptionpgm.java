package oops;

public class Exceptionpgm {

	private static Throwable e;

	public static void main(String[] args) {
		int a=10,b=0;
		try
		{
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			//System.out.println("arithmetic exception");
			  System.out.println(e.getMessage());
			  
		}
		System.out.println(e.getMessage());
		
		System.out.println("completed");
	}
	

}

    //try
    //{
        //String name=null;