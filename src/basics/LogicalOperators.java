package basics;

public class LogicalOperators {

	public static void main(String[] args) {
		/* A        B        A&&B      A||B           !A
		   1        1         1          1             0
 		   1        0         0          1             0
 		   0        1         0          1             1
 		   0        0         0          0             1 */
		 boolean x=true;
		   boolean y=false;
		   
		   System.out.println(x&&y);
		   System.out.println(x||y);
		   System.out.println(!x);
		   System.out.println(!y); 
		   
/*        // String username="abc";
           //String password="abcd3uu";
           //System.out.println(username=="abc" && password="abcd3");
           //System.out.println(username=="abc" || password="abcd");
           //system.out.println(!(username="abc")); */
 
		   

	}

}
