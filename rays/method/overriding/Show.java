package com.rays.method.overriding;

public class Show {

	private String color = null;
	private int borderWidth = 0;
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setBorderwidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	public int getBorderWidth() {
		return borderWidth;
	}
	
	public void area() {
		System.out.println("area of shape");
		
		
	}
}
