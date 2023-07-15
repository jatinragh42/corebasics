package com.rays.basics;

public class ForLoopSumOdd {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 1; i <= 100; i = i+2) {
			
			System.out.print(i);
			
			sum = sum + i;
			
			System.out.println("Sum = " +sum);
			
			
			
		}
	}
}
