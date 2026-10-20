package oops;

public class WithoutThis {
	String name;
     int rnum;
      float fee;

public WithoutThis(String Name,int r_num,float fees) {
	name=Name;
	rnum=r_num;
	fee=fees;
	
}
public void display() {
	System.out.println("name= "+name);
	System.out.println("Roll num= "+rnum);
	System.out.println("fee= "+fee);
	
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithoutThis ob=new WithoutThis("farhan",10,10000.20f);
		ob.display();

	}

}
