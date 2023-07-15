package com.rays.basics;

public class TestArr2 {
	
	public static void main(String[] args) {
		
		int[] table =new int [5];
		
		table[0] = 20;
		table[1] = 30;
		table[2] = 40;
		table[3] = 50;
		table[4] = 60;
		
	 //for(int i:table) {
	 
		// System.out.println(i);
		
		//OR
		
		//for(int i = 0; i < table.length; i++) {
			//System.out.println(table[i]);
	
		for(int i = 0; i < table.length; i++) {
			
			table[i] = (i+1)*2;
			
			System.out.println(table[i]);
		}
		
		}
	 }		
	
