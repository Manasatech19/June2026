package methodsandconstructor;

public class Parameterized {
	float area;
	public Parameterized(float l,float b) {
		area=l*b;
		System.out.println("area= "+area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameterized ob=new Parameterized(1.4f,2.2f);

	}

}
