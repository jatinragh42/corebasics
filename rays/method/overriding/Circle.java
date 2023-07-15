package com.rays.method.overriding;

public class Circle extends Show {
	
	private int radius = 0;
	
	public static final double PI = 3.14f;
     
     public void setRadius(int radius) {
    	 this.radius = radius;
	}
    public int getRadius() {
    	return radius;
    }
    
    public void area() {
    	double total = 2*PI*radius*radius;
    	System.out.println("Area of circle is " +total);
    }
}
