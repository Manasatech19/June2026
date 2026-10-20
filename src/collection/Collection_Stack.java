package collection;

import java.util.Stack;

public class Collection_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> ob=new Stack<Integer>();
		ob.push(11);
		ob.push(20);
		ob.push(1);
		ob.push(2);
		
		System.out.println(ob);
		
		ob.push(20);
		System.out.println("element= "+ob);
		
		//top element
		System.out.println("top element is= "+ob.peek());
		
		//remove top element
		ob.pop();
		System.out.println(ob);
		
		System.out.println("top element is= "+ob.peek());;

	}

}
