package exceptionhandling;

public class TryMultipleCatch {
	
	public static void main(String args[]) {
		int a=20;
		int arr[]=null;
		try {
		System.out.println(arr[1]);
		System.out.println(a/0);
		}
		
		catch(ArithmeticException e1) {
			System.out.println(e1);
		}
		catch(IndexOutOfBoundsException e2) {
			System.out.println(e2);
		}
		catch(Exception e) {
			System.out.println(e);
			
			
		}
		finally {
		System.out.println("helloooo");
		}


   }
}