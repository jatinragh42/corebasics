package in.co.rays.exercise;

import java.util.Scanner;

public class FibonacciSeries {
	
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of Fibonacci terms : ");
        
        int numTerms = input.nextInt();

        System.out.println("Fibonacci Series:");
        for (int i = 0; i < numTerms; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        input.close();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
