package array;

import java.util.Scanner;

public class ArrayScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int arraysize;
		
		System.out.println("enter the array size : ");
		arraysize=scan.nextInt();
		
		int arr[]=new int[arraysize];
		System.out.println("enter the elements: ");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println("array elements are: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
