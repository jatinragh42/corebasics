package com.rays.inheritance;

public class TestShape {
	
	public static void main(String[] args) {
		
		Shape s = new Shape();
		Rectangle r = new Rectangle();
		
		s.setColor("red");
		s.setBorderWidth(10);
		r.setLength(20);
		r.setWidth(20);
		
		System.out.println(s.getColor());
		System.out.println(s.getBorderWidth());
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
	}
	

}
