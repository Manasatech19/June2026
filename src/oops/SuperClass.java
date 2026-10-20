package oops;

class Superkeyword{
	String name="anu";
	
}


public class SuperClass extends Superkeyword {
	String name="Anupama";
	 
	public void display() {
		System.out.println(super.name);
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperClass key=new SuperClass();
		key.display();
		

	}

}
