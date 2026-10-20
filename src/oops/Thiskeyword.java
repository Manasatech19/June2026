package oops;

public class Thiskeyword {
	//instance variable
		String name;
		int rnum;
		float fee;
		
		public Thiskeyword(String name,int rnum,float fee) {
			name=name;
			rnum=rnum;
			fee=fee;
			
		}
		public void display() {
			System.out.println("name= "+name);
			System.out.println("Roll num= "+rnum);
			System.out.println("fee= "+fee);
			
			
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Thiskeyword ob=new Thiskeyword("farhan",10,10000.20f);
			ob.display();
			

	}

}
