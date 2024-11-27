package learnCollection;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
	//1.ArrayList, step1-Create object for ArrayList class	
		
	
		
		//
		List<Integer> id = new ArrayList<Integer>();
		
		id.add(1);
		id.add(10);
		id.add(20);
		id.add(30);
		id.add(40);
		id.add(50);
		
		System.out.println(id);
		System.out.println(id.size());
		System.out.println("************");
		//After adding new item in the List
		id.add(70);
		System.out.println(id);
		System.out.println(id.size());
		System.out.println("************");
		id.remove(4);
		
		System.out.println(id);
		System.out.println("************");
		System.out.println(id.contains(90));
		
	}

}
