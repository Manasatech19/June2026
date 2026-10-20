package work;

import java.util.Scanner;

public class Work6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("input the 1st number: ");
		int a=scan.nextInt();
		System.out.println("input the 2nd number: ");
		int b=scan.nextInt();
		System.out.println("input the 3rd number: ");
		int c=scan.nextInt();
		int greatest;
		if(a>b&&a>c) {
			greatest= a;		
		}
		else {
			if(b>a&&b>c) {
				greatest=b;
			}
			else {
				greatest =c;
			}
		}
		System.out.println("the greatest: "+greatest);

	}

}
