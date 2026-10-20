package oops;
class vehical{
	String color;
	public void start() {
		System.out.println("vehical starts");
	}
	
}
class Car extends vehical{
	String model="2020";
	public void car() {
		System.out.println("vehical type car");
	}
	
}


public class Heirarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehical v=new vehical();
		System.out.println();

	}

}
