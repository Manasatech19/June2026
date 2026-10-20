package array;

public class MultiDemension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[3][2];
		 
		arr[0][0]=20;
		arr[0][1]=40;
		arr[1][0]=50;
		arr[1][1]=60;
		arr[2][0]=70;
		arr[2][1]=80;
 
	//	System.out.println(arr[1][1]);
		
		for(int i=0;i<3;i++) {
		for(int j=0;j<2;j++) {

			System.out.println(arr[i][j]);
	}
		System.out.println();

}
		//array declaration with initialization
		int a[][]= {{11,12},{13,14},{15,16},{17,18}};
		for(int i=0;i<4;i++) {
			for(int j=0;j<2;j++) {
				System.out.println(a[i][j]);
				
			}
			System.out.println();
		}
  }
 }