package Controlstatements;

class parent
//method overridding
{
       String name="abc";
       
       
       public void phone()
       {
    	   System.out.println("nokia");
       }
}
class child extends parent
{
	public void phone()
	{
		System.out.println(super.name);
		super.phone();
		System.out.println("iphone");
		
	}
}
public class methodoverriding {
	public static void main(String[] args) {
		child c=new child();
		c.phone();
		
	}
}