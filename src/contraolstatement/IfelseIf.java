package contraolstatement;

public class IfelseIf {

	public static void main(String[] args) {
		String browser="edge";
		if(browser=="edge"){
			System.out.println("edge browser");
		}
		else if(browser=="Chrome") {
			System.out.println("chrome browser");			
		}
		else if(browser=="safari") {
			System.out.println("safari browser");			
		}
		else if(browser=="firefox") {
			System.out.println("firefox browser");			
		}
		// TODO Auto-generated method stub
		else {
			System.out.println("invalid browser");
		}
	}

}
