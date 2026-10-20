package collection;

import java.util.ArrayList;
import java.util.List;

public class Collection_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List li=new ArrayList();
		
		li.add("anurag");
		li.add(50);
		li.add("manasa");
		li.add(48);
		li.add("nayana");
		li.add(40);
		
		//display collection element
		System.out.println(li);
		
		//element size
		System.out.println("collection size= "+(li.size()));
		
		//for loop-display element in sequential way
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		  
		//random access
		System.out.println("4th index value= "+(li.get(3)));
		
		//addall element
		List li1=new ArrayList();
		li1.addAll(li);
		System.out.println(li1);
		
		//remove element
		li.remove(3);
		System.out.println(li);
		
		//add element
		li.add("minsha");
		li.add(50);
		System.out.println(li);
		
		//contain element
		System.out.println(li.contains("manasa"));
		
		//
		
	
		
		
	
		

	}

}
