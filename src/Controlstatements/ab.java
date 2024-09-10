package Controlstatements;

public class ab {

	public static void main(String[] args) {
		String x="welcome to luminar";
		System.out.println(x.replace("el","xy"));
		  //to display a particular character
		  String z="welcome";
		  System.out.println(z.charAt(4));
		  
		  //split
		  String w1="welcome to luminar";
		  String w[]=w1.split(" ");
		  for(String r:w)
		  {
			  System.out.println(r);
		  }
		  //tochararray()
		  String f="hello";
		  char words[]=f.toCharArray();
		  for(char l:words)
		  {
			  
			System.out.println(l);
			  
		  }

	}

}
