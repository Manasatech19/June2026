package oops;

class Superclass2{
	public Superclass2() {
	String name="anu";
	System.out.println(name);
	}
	public Superclass2(String name) {
		System.out.println(name);
	}
}

public class Superkey_Constructor extends Superclass2 {
	
	public Superkey_Constructor() {
		super("arun");
		String name="anupama";
		System.out.println(name);
	}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superkey_Constructor ob=new Superkey_Constructor();

	}

}
