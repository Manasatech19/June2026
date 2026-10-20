package exceptionhandling;

import java.util.Scanner;

public class VottingPro {

	public static void main(String[] args) throws AgeLimitException{
		// TODO Auto-generated method stub
		int age;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the age");
		age =scan.nextInt();
		try {
		if(age<18) {
			throw new AgeLimitException("below 18 is not eligible for vote");
		}
			else {
				System.out.println(" eligible for vote");
			}
		} 
	   catch(AgeLimitException e) {
		System.out.println(e);
	}
		System.out.println("welcome");

	}
}

