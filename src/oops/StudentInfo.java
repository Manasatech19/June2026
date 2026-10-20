package oops;

//public class StudentInfo extends StudentDetails{
public class StudentInfo{
	public static void main(String args[]) {
		StudentDetails ob=new StudentDetails();
		//StydentInfo ob=new StudentInfo();
		ob.setValues("abc123@gmail.com","abc@123");
		System.out.println(ob.getemailId());
		System.out.println(ob.getPassword());
		
	}


}
