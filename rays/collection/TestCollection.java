package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	
	public static void main(String[] args) {
		
		Collection c1 = new ArrayList();
		
		c1.add(100);
		c1.add("two");
		c1.add(true);
		
		//System.out.println(c1);

		Collection c2 = new ArrayList();
		
		c2.add("hii");
		c2.add("hello");
		c2.add("how are you");
		
		//c1.addAll(c2);
		//c2.clear();
		
		//System.out.println(c2.containsAll(c1));
		
		//System.out.println(c1);
		
		//System.out.println(c1.contains("hi"));
		
		//System.out.println(c1.isEmpty());
		
		//c2.remove("hii");
		
		//System.out.println(c2);
		
		//c2.removeAll();
		//System.out.println(c2);
		
		//c1.retainAll(c2);
		//System.out.println();
		
		//System.out.println(c1.size());
		//System.out.println(c2.size());
	}

}
