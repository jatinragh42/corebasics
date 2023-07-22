package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Iterator {

	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
		c.add("rahul");
		c.add("shyam");
		c.add("RAM");
		
	
		java.util.Iterator it = c.iterator();
		
		while(it.hasNext()) {
		Object o = it.next();
			
			System.out.println(o);
		}
	}
}
