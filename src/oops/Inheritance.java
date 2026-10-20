package oops;
class Animal{
	String color;
	
	public void eat() {
		System.out.println("animal is eating...");
	}
}
class Dog extends Animal{
	String breed="Pug";
	
	public void bark() {
		System.out.println("dog is barking....");
		
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog ob=new Dog();
		System.out.println("breed= "+(ob.breed));
		System.out.println("color= "+(ob.color="black"));
		ob.eat();
		ob.bark();

	}

}
