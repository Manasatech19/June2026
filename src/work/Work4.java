package work;

import java.util.Scanner;

public class Work4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Input first number: ");
		int a=scan.nextInt();
		System.out.println("Input second number: ");
		int b=scan.nextInt();
		System.out.println("Input third number: ");
		int c=scan.nextInt();
		System.out.println("input fourth number: ");
		int d=scan.nextInt();
		if(a==b&&b==c&&c==d) {
			System.out.println("number are equal!");	
		}
		else {
		System.out.println("number are  not equal");
		}

	}

}
