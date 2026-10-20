package methodsandconstructor;

import java.util.Scanner;

public class MethodScanner2 {
	//function with return type and parameter
	public int add(int num1,int num2) {
		int sum;
		return sum=num1+num2;
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodScanner2 ob=new MethodScanner2();
		Scanner scan= new Scanner(System.in);
		System.out.println("enter first number: ");
		int num1=scan.nextInt();
		System.out.println("enter second number: ");
		int num2=scan.nextInt();
		System.out.println(ob.add(num1,num2));

	}

}
