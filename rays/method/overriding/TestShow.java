package com.rays.method.overriding;

public class TestShow {
	
	public static void main(String[] args) {
		
		Show s = new Rectangle2();
		Show s1 = new Circle();
		Show s2 = new Triangle();
		
		Rectangle2 r = (Rectangle2) s;
		Circle c = (Circle) s1;
		Triangle t = (Triangle) s2;
		
		
		r.setBorderwidth(20);
		r.setColor("yellow");
		r.setLength(10);
		r.setWidth(10);
		c.setRadius(5);
		t.setBase(20);
		t.setHeight(20);
		
		
		r.area();
		c.area();
		t.area();
		
		System.out.println(r.getBorderWidth());
		System.out.println(r.getColor());
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		
		
	}

}
