package in.co.rays.exercise;
	
import java.util.Scanner;

	public class AverageOfConsecutiveNumbers {
		
	    public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the value of N: ");
	        int n = scanner.nextInt();

	        // Calculate the average of consecutive N odd numbers
	        double oddAverage = calculateAverageOfConsecutiveOddNumbers(n);
	        System.out.println("Average of consecutive " + n + " odd numbers: " + oddAverage);

	        // Calculate the average of consecutive N even numbers
	        double evenAverage = calculateAverageOfConsecutiveEvenNumbers(n);
	        System.out.println("Average of consecutive " + n + " even numbers: " + evenAverage);

	        scanner.close();
	    }

	    // Method to calculate the average of consecutive N odd numbers
	    public static double calculateAverageOfConsecutiveOddNumbers(int n) {
	        int start = 1;
	        int sum = 0;

	        for (int i = 0; i < n; i++) {
	            sum += start;
	            start += 2; // Move to the next odd number
	        }

	        return (double) sum / n;
	    }

	    // Method to calculate the average of consecutive N even numbers
	    public static double calculateAverageOfConsecutiveEvenNumbers(int n) {
	        int start = 2;
	        int sum = 0;

	        for (int i = 0; i < n; i++) {
	            sum += start;
	            start += 2; // Move to the next even number
	        }

	        return (double) sum / n;
	    }
	}



