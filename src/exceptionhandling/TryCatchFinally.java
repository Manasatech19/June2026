package exceptionhandling;

public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		System.out.println(a/0);
		try {
			System.out.println(a/0);
		}
		catch(Exception e) {
		System.out.println(e);
			
		}
	System.out.println("hello");

}
}