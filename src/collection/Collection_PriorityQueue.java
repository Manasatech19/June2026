package collection;

import java.util.PriorityQueue;

public class Collection_PriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> ob =new PriorityQueue<String>();
		ob.add("hello");
		ob.add("good");
		ob.add("200");
		ob.add("221");
		 
		System.out.println(ob);
		ob.add("good");
		System.out.println(ob);
		
		ob.remove();
		System.out.println(ob);

	}

}
