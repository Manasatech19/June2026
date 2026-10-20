package switchstatement;

public class University {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int school=2;
		 char department='b';
		switch(school) {
		case 1 : System.out.println("1.school of computer science");
			switch(department) {
			case 'a' : System.out.println("a.department of information");
			break;
			case 'b' :System.out.println("b.department of machine learning");
			break;					
			}
			break;
			
		case 2 : System.out.println("2.school of business");
		switch(department) {
		case 'a' : System.out.println("a.department of commerce");
		break;
		case 'b' :System.out.println("b.department of purchasing");
		break;	
		}
		break;
		
		case 3 : System.out.println("3.school of engineering");
		switch(department) {
		case 'a' : System.out.println("a.department of mechanical engineering");
		break;
		case 'b' :System.out.println("b.department of mechtronics engineering");
		break;	
		}
		break;
		default :System.out.println("choose correct option");
		}
				

	}

}
