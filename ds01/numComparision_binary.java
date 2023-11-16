package ds01;

import java.util.Arrays;
import java.util.Scanner;

public class numComparision_binary {

    public static void main(String[] args) {
    	Scanner in=new Scanner (System.in);
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("enter key to search: ");
        int key=in.nextInt();

        int comparisons = binarySearch(array, key);

        if (comparisons != -1) {
            System.out.println("Element found at index " + comparisons);
            System.out.println("Number of comparisons: " + (comparisons + 1));
        } else {
            System.out.println("Element not found in the array");
        }
    }

    public static int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;
        int comparisons = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            comparisons++;

            if (array[mid] == key) {
                return mid; // Key found
            } else if (array[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Key not found
    }
}
