package in.co.rays.exercise;

import java.util.Scanner;

public class Question12 {
	
	  public static void main(String[] args) {
		  
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a number: ");
	        
	        int number = scanner.nextInt();

	        if (isPalindrome(number)) {
	            System.out.println(number + " is a palindrome.");
	        } else {
	            System.out.println(number + " is not a palindrome.");
	        }

	        scanner.close();
	    }

	    public static boolean isPalindrome(int number) {
	        int originalNumber = number;
	        int reversedNumber = 0;

	        while (number > 0) {
	            int lastDigit = number % 10;
	            reversedNumber = reversedNumber * 10 + lastDigit;
	            number /= 10;
	        }

	        return originalNumber == reversedNumber;
	    }
	}

	
	


