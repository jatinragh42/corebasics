package com.rays.basics;

public class TestString4 {
	
	public static void main(String[] args) {
		
	String name = "Jatin Singh Raghuwanshi";
	
	System.out.println(name.length());
	System.out.println(name.charAt(6));      
	System.out.println(name.indexOf("Jatin"));
	System.out.println(name.lastIndexOf("i"));
	System.out.println(name.replace("a", "t"));
	System.out.println(name.toLowerCase());
	System.out.println(name.toUpperCase());
	System.out.println(name.startsWith("Jatin"));
	System.out.println(name.endsWith("Raghuwanshi"));
	System.out.println(name.substring(6));
	
		
	}
}
