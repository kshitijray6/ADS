package ds01;

import java.util.Arrays;
import java.util.Scanner;

public class numComparision_linear {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int[] arr = {22,55,88,11,44,66,33};
	        System.out.println(Arrays.toString(arr));
	        System.out.print("Enter the key to search: ");
	        int key = scanner.nextInt();

	        int comparisons = linearSearch(arr, key);

	        if (comparisons != -1) {
	            System.out.println("Key found at index " + comparisons);
	            System.out.println("Number of comparisons: " + (comparisons + 1)); // Adding 1 to account for the last comparison
	        } else {
	            System.out.println("Key not found in the array.");
	            System.out.println("Number of comparisons: " + arr.length); // All elements were compared, and key was not found
	        }
	    }

	    public static int linearSearch(int[] arr, int key) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == key) {
	                return i; // Key found at index i
	            }
	        }
	        return -1; // Key not found in the array
	    }
	}
