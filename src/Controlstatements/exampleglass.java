package Controlstatements;

public class exampleglass {

	public static void main(String[] args) {
		//length of a string
		String s="welcome";
		//System.out.println(s.length());
		      int a=s.length();
		  System.out.println("length:"+a);
		  
		  String s1="hello";
		  String s2="luminar";
		  System.out.println(s1.concat(s2));
		  /* System.out.println(s1+s2);
		   * System.out.println(1+2+s1);
		   * System.out.println(s1+1+2);*/
		  
		        String s3="Luminar123";
		        System.out.println(s3.toLowerCase());
		        System.out.println(s3.toUpperCase());
		        System.out.println(s3.endsWith("3"));
		        System.out.println(s3.startsWith("u"));
		        
		        String x="abc";
		        String y="abc";
		        System.out.println(x.equals(y));
		        System.out.println(x.equalsIgnoreCase(y));
		        
		        System.out.println(y.contains("a"));
		        
		        String q="hello";
		        System.out.println(q);
		        System.out.println(q.trim());
		        
		        
		        String y1="welcome";
		        System.out.println(y1.substring(3));
		        System.out.println(y1.substring(0, 4));
		        
		        
		        

	}

}
