package com.rays.tostrings;

public class Person {
	
	private int id = 0;
	private String name = null;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name ) {
		this.name = name;
	}
	public String getName() {
		return name;
		
		
	}
	
	@Override
	public String toString() {
		return(id+" "+name);
	}
	
}

