package in.co.rays.exercise;

import java.util.Scanner;

public class Question14 {

 
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the value of N: ");
	        int n = scanner.nextInt();

	        System.out.println("Average of consecutive " + n + " odd numbers: " + calculateOddAverage(n));
	        System.out.println("Average of consecutive " + n + " even numbers: " + calculateEvenAverage(n));

	        scanner.close();
	    }

	    public static double calculateOddAverage(int n) {
	        int sum = 0;
	        int count = 0;
	        int oddNumber = 1;

	        while (count < n) {
	            sum += oddNumber;
	            oddNumber += 2;
	            count++;
	        }

	        return (double) sum / n;
	    }

	    public static double calculateEvenAverage(int n) {
	        int sum = 0;
	        int count = 0;
	        int evenNumber = 2;

	        while (count < n) {
	            sum += evenNumber;
	            evenNumber += 2;
	            count++;
	        }

	        return (double) sum / n;
	    }
	}



