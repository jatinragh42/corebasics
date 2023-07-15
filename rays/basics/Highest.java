package com.rays.basics;

public class Highest {
	
	public static void main(String[] args) {
		
		int[] arr = {100,45,12,111,67,109};
		
		int a = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]>a) {
				
				a = arr[i];
				
			}
			
		}
		
		System.out.println(a);
	}

}
