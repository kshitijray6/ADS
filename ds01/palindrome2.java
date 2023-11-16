package ds01;

import java.util.Scanner;

public class palindrome2 {
	
	public static String palindrome(String str,String reverseStr)
	{
		for (int i = str.length(); i >=0; --i) 
	    {
	       reverseStr = reverseStr + str.charAt(i);
	    }
		return reverseStr;
	}

	public static void main(String[] args) 
	{
		Scanner in=new Scanner (System.in);
		System.out.println("Enter a string to check for pallindrome : ");
		String str = in.next();
		String rev= palindrome(str,"");
		
		if (str.equals(rev))
	    {
	    	System.out.println("The string " + str + "is pallindrome" );
	    }
      else
    	  System.out.println("not pallindrome");
				
	    }

	}

//1. palindrome using recursion.
//time complexity T(n)= O(n)+ slower
