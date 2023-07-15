package com.rays.oop;

public class Person {
	
	private int id = 0;
	private String name = null;
	private String address = null;
	
	public Person() {
		System.out.println("in constructor");
	}
	
	public Person(int id, String name, String address) {
		
	//System.out.println(this.id = id);
	 // System.out.println(this.name = name);
		//System.out.println(this.address = address);
		
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
		
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
		return address;
	}

	}


