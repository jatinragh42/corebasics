package com.rays.date;
import java.util.*;

public class TestCalendar {
	
	public static void main(String[] args) {
		
		Date today = new Date();
		
	    Calendar cal = Calendar.getInstance();
			
		cal.setTime(today);
		
		for (int i = 1; i <= 12; i++) {
	    
	    cal.add(Calendar.DATE, 30); 
	    
	    System.out.println(cal.getTime());
		}

}
}