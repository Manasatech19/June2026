package contraolstatement;

public class NestedStatement {

	public static void main(String[] args) {
		int num=-20;
		if(num>0) {
		     if(num%2==0) {
			System.out.println(num+" is positive and even number");
			
			}
		else {
			System.out.println(num+" is positive and odd number");
		}// TODO Auto-generated method stub

	}
	else {
		if(num%2==0) {
			System.out.println(num+" is negative and even number");

		}
		else {
			System.out.println(num+" is negative and odd number");

		}
		}
	}

}
