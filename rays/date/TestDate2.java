package com.rays.date;

import java.text.SimpleDateFormat;
import java.util.*;

public class TestDate2 {
	
	public static void main(String[] args) {
		
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				
				System.out.println(sdf.format(d));
				
				
	}

}
