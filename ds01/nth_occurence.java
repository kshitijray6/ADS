package ds01;

import java.util.Scanner;

public class nth_occurence {
	

	public static int linearSearch1(int arr[],int key,int occ)
	{
		int count=0;
		    for (int i = 0; i <= arr.length - 1; i++) 
		    {
		    	if (arr[i] == key) 
		    		{
		    		count++;
		    			
		    		}
		    }
		    if(count==occ)
				System.out.println("found");
			else
				System.out.println("not found");
				
		    
		 return -1;   
	}

	public static void main(String[] args) 
	{	
		Scanner in=new Scanner(System.in);
		
		int arr[]= {11,44,33,66,33,55,99,11,33};
		System.out.println("enter the n key: ");
		int key =in.nextInt();
		System.out.println("enter the occurenece of the key: ");
		int occ=in.nextInt();
		System.out.println(linearSearch1(arr, key,occ));
	
	}

}

//6. Implement linear search algorithm to find the nth occurence of the given element. If nth occurrence is not found, return -1.
