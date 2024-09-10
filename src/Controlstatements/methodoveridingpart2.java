package Controlstatements;

 class car {

	 public void speed()
	 {
		 System.out.println("car speed");
	 }
	 public void power() {
		 System.out.println("car power");
		 
	 }
}
 class bmw extends car{
	public void speed() {
		System.out.println("bmw speed");
		super.speed();
	}
	
	public void power() {
		System.out.println("bmw power");
		    super.power();
	}
	 
 }
 public class methodoveridingpart2 {
		public static void main(String[] args) {
			bmw obj=new bmw();
			obj.speed();
			obj.power();
			obj.power();
		}
 }
 
