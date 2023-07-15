package com.rays.methodoverriding.with;

public class Triangle2 extends Sheer{

	private int base = 0;
	private int height = 0;
	
	public void setBase(int base) {
		this.base = base;
	}
	public int getbase() {
		return base;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void area() {
		int total = (height*base)/2;
		System.out.println("Area of Triangle is " +total);
	}

}
