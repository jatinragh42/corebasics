package com.rays.oop;

public class Account {
	
    private int id = 0;
    private String name = null;
    
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
}