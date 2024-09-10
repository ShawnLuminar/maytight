package oops;

class Encaps {
	private String name;
	private String designation;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = "name";
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public String getdesignation() {
		return designation;
	}

}
public class Encapsulationpgm {
	public static void main(String[] args) {
		Encaps ob=new Encaps();
		ob.setname("anusha");
		System.out.println(ob.getname());
		ob.setDesignation("Tester");
		System.out.println(ob.getdesignation());
		//ob.setname("Rakhy");
		// System.out.println(ob.getName());
		
	}
}
