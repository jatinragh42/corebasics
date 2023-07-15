package com.rays.basics;

public class ArrSecondHighest2 {
	
	public static void main(String[] args) {
		
		int[] arr = {45, 78, 95, 500, 74, 14, 123};
		
		int min = 0;
		int max = 0;
		
		for (int i = 0; i < arr.length; i++) {
		
			if(arr[i]>max) {
				
				min = max;
				max = arr[i];
						
			}
			if(max>arr[i] && min<arr[i]) {
				min = arr[i];
			}
			
			
			
		}
		System.out.println(min);
	
		
	}
	
	
	}