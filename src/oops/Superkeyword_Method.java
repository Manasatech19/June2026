package oops;

class Superclass{
	public void display() {
		String name="anu";
		System.out.println(name);
	}
	
}

public class Superkeyword_Method extends Superclass {
	public void display() {
		String name="anupama";
		super.display();
		System.out.println(name);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superkeyword_Method ob=new Superkeyword_Method();
		ob.display();

	}

}
