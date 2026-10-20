package oops;

public class WithThis {
	//instance variable
			//WITH THIS
			String name;
			int rnum;
			float fee;
			
			public WithThis(String Name,int r_num,float fees) {
				this.name=Name;
				this.rnum=r_num;
				this.fee=fees;
				
			}
			public void display() {
				System.out.println("name= "+name);
				System.out.println("Roll num= "+rnum);
				System.out.println("fee= "+fee);
				
				
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithThis ob=new WithThis("farhan",10,10000.20f);
		ob.display();

	}

}
