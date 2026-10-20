package methodsandconstructor;

public class Rectangle {
	float l,b;
	float area;
	//DEFAULT constructor
	public Rectangle() {
		l=2.2f;
		b=2.6f;
		area=l*b;
		System.out.println("area= "+area);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle ob=new Rectangle();

	}

}
