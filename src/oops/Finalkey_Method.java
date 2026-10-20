package oops;

class Finalclass{
	public void display() {
		System.out.println("hello...");
		
	}
}
public class Finalkey_Method extends Finalclass{
	public void display1() {
		System.out.println("java programming");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finalkey_Method ob=new Finalkey_Method();
		ob.display();
		ob.display1();

	}

}
