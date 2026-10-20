package oops;

abstract class Vehical{
	public abstract void start(); //abstract method
	
	public void sound() { //non abstract method
		System.out.println("beeepp...beeepp...");		
	}
	
}

class Bike extends Vehical{
	
	public void Start() {
		System.out.println("kick start");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}
	
}

class Train extends Vehical{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("button Start");
		
	}
	
}

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b=new Bike();
		b.Start();
		b.sound();
		
		Vehical v=new Train();//up-casting
		v.start();
		v.sound();
		
		
		
		

	}

}
