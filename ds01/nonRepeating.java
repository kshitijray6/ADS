package ds01;

import java.util.Scanner;

public class nonRepeating {
	public static void linearSearch1(int arr[])
	{
		int count=0;
		    for (int i = 0; i <= arr.length - 1; i++) 
		    {
		    	count=0;
		    	for (int j = 0; j <= arr.length - 1; j++)
		    	{
		    		if(arr[i]==arr[j])
		    			count++;
		    	}
		    	if (count==1)
		    	{
		    		System.out.println("non repeating :"+arr[i]);
		    		break;
		    	}
		    	
		    }  
	}

	public static void main(String[] args) 
	{	
		Scanner in=new Scanner(System.in);
		
		int arr[]= {1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8};
	
		linearSearch1(arr);
	
	}

}

//7. find the first non-repeating element: Input: { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 }