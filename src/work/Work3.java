package work;

import java.util.Scanner;

public class Work3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("input first number: ");
		int m=scan.nextInt();
		System.out.println("input second Integer: ");
		int n=scan.nextInt();
		if(m!=n) {
			System.out.println(m+"!="+n);
		}
		if(m<n) {
			System.out.println(m+"<"+n);
		}
		if(m<=n) {
			System.out.println(m+"<="+n);
		}
		

	}

}
