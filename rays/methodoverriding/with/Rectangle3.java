package com.rays.methodoverriding.with;

public class Rectangle3 extends Sheer {
	private int length = 0;
	private int width = 0;
	
	public void setLength(int length) {
		this.length = length;
	}

	public int getLength() {
		return length;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return width;
	}
	public void area() {
		int total = length*width;
		System.out.println("Area of Rectangle is " +total);
	}


}
