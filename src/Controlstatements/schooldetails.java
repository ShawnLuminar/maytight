package Controlstatements;


class statics 
{
	final String schoolname="Luminar";
	static String department="English";
}
public class schooldetails {
	public static void main(String[] args) {
		System.out.println(statics.department);
		System.out.println(statics.department="Malayalam");
		System.out.println(statics.department);
		//System.out.println(statics.);
		statics ob=new statics();
		System.out.println(ob.schoolname);
		// System.out.println(ob.schoolname="abc");
		
	}
}

	


