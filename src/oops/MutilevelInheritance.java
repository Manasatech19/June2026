package oops;
class Animal1{
	
	String color;
	
	public void eat() {
		System.out.println("animal is eating...");
	}
}
class Dog1 extends Animal1{
	String breed="Pug";
	
	public void bark() {
		System.out.println("dog is barking....");
		
	}
}
class Puppy extends Dog1{
	int age=1; 
	
	public void play() {
		System.out.println("puppy is playing");
	}
}
public class MutilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy ob=new Puppy();
		System.out.println("breed= "+(ob.breed));
		System.out.println("color= "+(ob.color="black"));
		System.out.println("age="+(ob.age));
		ob.eat();
		ob.bark();
		ob.play();

	}

}
