package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Collection_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> ob=new HashSet<String>();
		
		ob.add("Anu");
		ob.add("hridya");
		ob.add("Amjith");
		ob.add("shabeek");
		
		System.out.println(ob);
		
		ob.add("libna");
		System.out.println(ob);
		
		for(String data: ob) {
			System.out.println(data+" ");	}
		
		System.out.println();
		Iterator itr =ob.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		ob.add(null);
		System.out.println("amjith");
		System.out.println(ob);
		}

}
