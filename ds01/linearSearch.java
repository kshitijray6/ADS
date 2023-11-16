package ds01;

import java.util.Scanner;

public class linearSearch {
	
	public static int linearSearch1(int arr[],int key)
	{
		int res = -1;
	    for (int i = arr.length - 1; i >= 0; i--) //just reverse read the array to find the first occurrence. 
	    {
	      if (arr[i] == key) 
	      {
	        res = i;
	        break;
	      }
	    }
	    return res;
	}

	public static void main(String[] args) 
	{	
		Scanner in=new Scanner(System.in);
		
		int arr[]= {11,44,33,66,33,55,99,11};
		System.out.println("enter the key: ");
		int key =in.nextInt();
		System.out.println(linearSearch1(arr, key));
	
	}
}
//2. Write a linear search algorithm to return index of last occurance of key.
//Time complexity T(n)= O(1).