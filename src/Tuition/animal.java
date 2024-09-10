package Tuition;

interface basicanimal {
	void eat();
	void sleep();

}
class Monkey {
	void jump(){
		System.out.println(" Monkey is jumping");
	}
	void bite() {
		System.out.println(" Monkey is biting");
	}
}

class Human extends Monkey implements basicanimal	{
	void speak() {
		System.out.println(" Human is speaking ");
	}
	public void eat() {
		System.out.println(" Human is eating ");
	}
	public void sleep() {
		System.out.println(" Human is sleeping ");
		
	}
	
}
public class animal {
	public static void main(String[] args) {
		Human H=new Human();
		H.eat();
		H.bite();
		H.sleep();
		H.jump();
		H.speak();
		H.eat();
		H.sleep();
	}
}
