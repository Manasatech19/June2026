package methodsandconstructor;

public class Copy {
	float area;
	public Copy(float l,float b) {
		area =l*b;
	}
	public void display() {
	 System.out.println("Area= "+area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Copy ob=new Copy(1.4f,2.2f);
		ob.display();
		Copy ob1=ob;
		ob1.display();
		

	}

}
