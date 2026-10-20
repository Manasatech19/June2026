package contraolstatement;

public class ContinueStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer:for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i==2&&j==3) {
					continue outer;
				}
					System.out.println(i+" "+j);
				
			}
			System.out.println();
		}

	}

}
