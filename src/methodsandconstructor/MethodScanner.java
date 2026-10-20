package methodsandconstructor;

import java.util.Scanner;

public class MethodScanner {
	//function with no return type and no parameter
	public void add() {
		Scanner scan= new Scanner(System.in);
		int num1,num2,sum;
		System.out.println("enter first number: ");
		num1=scan.nextInt();
		System.out.println("enter second number: ");
		num2=scan.nextInt();
		sum=num1+num2;
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodScanner ob=new MethodScanner();
		ob.add();

	}

}
