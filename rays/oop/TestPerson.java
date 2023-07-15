package com.rays.oop;

public class TestPerson {
	
	public static void main(String[] args) {
		
		//Person p = new Person();
		Person s = new Person(20, "rahu", "indore");
		
		s.setId(50);
		s.setName("jatin");
		s.setAddress("khargone");
		
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getAddress());
		
	}

}
