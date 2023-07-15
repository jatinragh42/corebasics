package com.rays.methodoverriding.with;

public class TestSheer {

	public static void main(String[] args) {
		
		Sheer[] s = new Sheer[3];
		
		s[0] = new Rectangle3();
		s[1] = new Circle2();
		s[2] = new Triangle2();
		
		Rectangle3 r = (Rectangle3) s[0];
		Circle2 c = (Circle2) s[1];
		Triangle2 t = (Triangle2) s[2];
		
		r.setColor("yellow");
		r.setLength(10);
		r.setWidth(20);
	    c.setRadius(7);
	    t.setBase(5);
	    t.setHeight(4);
	    
	    for (int i = 0; i < s.length; i++) {
	    	s[i].area();
	    	
			
		}
				
	}
}
