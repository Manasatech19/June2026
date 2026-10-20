package oops;

public class StudentDetails {
	//variable
	private String emailId;
	private String Password;
	
	//methods
//	public void setemailId(String emailId) {
//		this.emailId=emailId;
//	}
//	public void setPassword(String Password) {
//		this.Password=Password;
//		
//	}
	public void setValues(String emailId,String Password) {
		this.emailId=emailId;
		this.Password=Password;
		
	}
	public String getemailId() {
		return emailId;
	}
	public String getPassword() {
		return Password;
	}

}
