package methodsandconstructor;

public class MethodPro {
	//method declaration
	//non static
	public void add() {
		int num1=20,num2=50,sum;
		sum=num1+num2;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=700,num2=500;
		System.out.println("maximum values are: "+(Math.max(num1, num2)));
		
		MethodPro ob=new MethodPro();
		ob.add();
	}

}
