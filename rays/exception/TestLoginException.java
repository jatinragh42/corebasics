package com.rays.exception;

public class TestLoginException {
	
	public static void main(String[] args) {
		
		try {
			
			String name = "sunil";
			
			if(name.equals("admin")) {
				System.out.println("valid user......!!!");
				
			}else {
				LoginException e = new LoginException();
				throw e;
				
			}
			
		}catch(Exception e) {
			System.out.println(e);
			
		}
	}
}
