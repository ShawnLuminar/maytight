package Controlstatements;

public class stringpass {

	public static void main(String[] args) {
		String q="java language is platform independent";
		System.out.println(q.contains("language"));
		if(q.contains("langauge"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

	}

}
