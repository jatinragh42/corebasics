package com.rays.exception;

public class TestTryCatch {
	
	public static void main(String[] args) {
		
		try {
			int a = 10;
			System.out.println("a =" +a);
			
			int b = 0;
			System.out.println("b = " +b);
			
			int c = a/b;
			System.out.println("division = " +c);
		
		String name = "jatin";
		System.out.println(name.charAt(6));
		
		}catch(ArithmeticException e) {
		System.out.println(e);
	}	
			
	}
}
	


