package in.co.rays.exercise;

import java.util.Scanner;

	public class FactorialCalculator {

	    public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a number to find its factorial: ");
	        
	        int number = scanner.nextInt();
	        scanner.close();

	        long factorial = calculateFactorial(number);
	        System.out.println("The factorial of " + number + " is: " + factorial);
	    }

	    public static long calculateFactorial(int n) {
	        if (n == 0 || n == 1) {
	            return 1;
	        } else {
	            return n * calculateFactorial(n - 1);
	        }
	    }
	}



