package ds01;

import java.util.Scanner;

public class BS_Desc {
	
	public static int binarySearch(int arr[],int key,int left,int right)
	{
		if(left < right)                                        // to move left from the right end
			return -1;
		
		int mid = (left + right)/2;
		
		if(key == arr[mid])
			return mid;	
		else if(key > arr[mid])
			return binarySearch(arr, key, mid + 1, right);
		else
			return binarySearch(arr, key, left, mid - 1);
			
	}
		
	

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int arr[]= {99,88,77,66,55,44,33,22,11};
		System.out.println("enter the key");
		int key =in.nextInt();
		System.out.println(binarySearch(arr, key, arr.length-1,0));  //starting element is length-1(start)..... ending element is 0(start).

	}

}
//5. Implement binary search algorithm if array is sorted in descending order.