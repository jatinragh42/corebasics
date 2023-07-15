package com.rays.basics;

public class TestString {

	public static void main(String[] args) {
		
		String name = "core java";
		
		//System.out.println(name.charAt(0));
		//System.out.println(name.charAt(1));
		//System.out.println(name.charAt(2));
		//System.out.println(name.charAt(3));
		//System.out.println(name.charAt(4));
		//System.out.println(name.charAt(5));
		
		//OR
		
		//for (int i = 0; i <= name.length(); i++) {
			//System.out.println(i);
		
		//OR	
			
		//for (int i = 0; i < name.length(); i++) {
			//System.out.println(name.charAt(i));
		
		//for reverse
		
		for (int i = name.length()-1; i>=0 ; i--) {
			System.out.println(name.charAt(i));
		}
		}
		}
		
	
