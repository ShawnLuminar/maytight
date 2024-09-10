package Tuition;

import assignment.encapsulation;

public class assign1 {
	//private static final String String = null;
	private String name;
	private String designation;
	
	//get for the name
	public String getName() {
		return name;
	}
	
	//set for the name
	public void setName(String name) {
		 this.name=name;
	}
		//get for the designation
	public String getDesignation() {
			return designation;
		}
		//setter for the designation
		public void setDesignation(String designation) {
			this.designation=designation;
		}
		public static void main(String[]args)
		{
			assign1 ob=new assign1();
			ob.setName("Anusha");
			System.out.println(ob.getName());
			ob.setDesignation("tester");
			System.out.println(ob.getDesignation());
				
			
		}
	}


