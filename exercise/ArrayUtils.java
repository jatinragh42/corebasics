package in.co.rays.exercise;
	
public class ArrayUtils {
	    public static int findLargestNumber(int[] arr) {
	        if (arr == null || arr.length == 0) {
	            throw new IllegalArgumentException("The array is empty or null.");
	        }

	        int largestNumber = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > largestNumber) {
	                largestNumber = arr[i];
	            }
	        }

	        return largestNumber;
	    }

	    public static void main(String[] args) {
	        int[] numbers = { 12, 45, 3, 78, 23, 67, 89 };
	        int largest = findLargestNumber(numbers);
	        System.out.println("The largest number in the array is: " + largest);
	    }
	}



