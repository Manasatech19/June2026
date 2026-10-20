package array;

import java.util.Scanner;

public class MultiDimensionScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int columnsize;
		int rowsize;
		
		System.out.println("enter the rowsize");
		rowsize=scan.nextInt();
		
		System.out.println("enter colunmsize");
		columnsize=scan.nextInt();
		
		int arr[][]=new int[rowsize][columnsize];
		System.out.println("enter array element");
		for(int i=0;i<rowsize;i++) {
			for(int j=0;j<columnsize;j++) {
				arr[i][j]=scan.nextInt();
			}		    		
		}
		for(int i=0;i<rowsize;i++) {
			for(int j=0;j<columnsize;j++) {
				System.out.println(arr[i][j]);
			}
		}

	}

}
