package oops;


public class Car1 implements VehicaL1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicaL1 v=new Car1();//up-casting 
		v.start();
		

	}
	public void start() {
		System.out.println("Self Start");
	}

}
