package array;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "manasa";
		String s2="surendran";
		//length
		System.out.println(s1.length());
		System.out.println(s2.length());
		
		//char
		
		System.out.println(s1.charAt(3));
		System.out.println(s2.charAt(6));
		
		//concat
		System.out.println(s1.concat("das"));
		
		//CompareTo
		String name1="hello";
		String name2="hello";
		String name3="meklo";
		String name4="hemlo";
		String name5="GO";

		System.out.println(name1.compareTo(name2));
		System.out.println(name1.compareTo(name3));
		System.out.println(name1.compareTo(name4));
		System.out.println(name1.compareTo(name5));
		System.out.println(name1.compareTo(name1));
		
		//String Contain
		String s3=("java is a high level programming language");
		System.out.println(s3.contains("high level"));
		System.out.println(s3.contains("low level"));
		
		//.equals
		System.out.println(name1.equals(name2));
		System.out.println(name2.equals(name3));
		
		//StringEqualsIgnoreCase
		System.out.println(name1.equalsIgnoreCase(name2));
		
		//To uppercases
		System.out.println(name1.toUpperCase());
		
		//to lower Cases
		System.out.println(name5.toLowerCase());
		
		//getbyte
		String s="ABCDEFGH";
		byte b[]=s.getBytes();
		for(int i=0;i<b.length;i++) {
			
			System.out.println(b[i]);
		}
		
		//stringSubstring
		String m1="programming";
		System.out.println(m1.substring(3));
		System.out.println(m1.substring(3,9));
		
		//Startswith
		String m2="india is good country";
		System.out.println(m2.startsWith("india"));
		System.out.println(m2.startsWith("good"));
		
		//endswith
		String m3="india is good country";
		System.out.println(m3.endsWith("country"));
		System.out.println(m3.endsWith("india"));
		
		//replace
		String m4="java is a programming language";
		System.out.println(m4.replace('a', 'o'));
		System.out.println(m4.replace("is","was"));
		
		//trim
		String m5="hello java";
		System.out.println(m5+"javaprogramming");
		System.out.println(m5.trim()+"javaprogramming");

	}

}
