package collection;

import java.util.ArrayDeque;

public class Collection_ArrayDequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> ob=new ArrayDeque<String>();
		ob.add("hello");
		ob.add("good");
		ob.add("java");
		ob.add("abc");
		
		System.out.println(ob);
		
		System.out.println("top element=  "+ob.peek());
		
		ob.addFirst("manasa");
		ob.addLast("nayana");
		System.out.println(ob);
		
		System.out.println("first element= "+ob.peekFirst());
		System.out.println("last element= "+ob.peekLast());
		
		//remove top element
		ob.poll();
		System.out.println(ob);
		
		//remove first element
		ob.pollFirst();
		System.out.println(ob);
		
		//remove last element
		ob.pollLast();
		System.out.println(ob);

	}

}
