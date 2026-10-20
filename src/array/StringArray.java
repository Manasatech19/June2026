package array;

//import string.String;

//import string.String;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//string array
		String names[] = {"Manasa","Nayana","Minsha","Aslaha"};
		System.out.println(names[1]);
		
		//string literals
		String name1 = "arun";
		String name2 = "athul";
		//compare
		System.out.println(name1==name2);
		
		//new keyword-->heap memory,string constant pool
		String name3 = new String("athul");
		String name4 = new String("athul");
		//compare
		System.out.println(name3.equals(name4));
		
		//string method-->equals
		System.out.println(name4);
		//compare
		System.out.println(name2== name3);
		System.out.println(name2.equals(name3));
		
		//join two string
		name1=name1+"thomas";
		System.out.println(name1);
		
		//using concat
		
		name2.concat("das");
		System.out.println(name2);
		
		//String buffer and string builder
		StringBuffer st=new StringBuffer("mohan");
		StringBuilder st1=new StringBuilder("das");
		
		st.append(st1);
		System.out.println(st);
		
		st.append("v");
		System.out.println(st);
		

	}

}
