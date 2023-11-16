package ds01;

import java.util.Scanner;

public class palindrome1 {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		System.out.println("Enter a string to check for pallindrome : ");
		String str = in.next();
		String reverseStr= "";

	    for (int i = str.length(); i >=0; --i) 
	    {
	      reverseStr = reverseStr + str.charAt(i);
	    }

		    if (str.equals(reverseStr))
		    {
		    	System.out.println("The string " + str + "is pallindrome" );
		    }
	      else
	    	  System.out.println("not pallindrome");
					
		    }
		}	

//palindrome using iteration.
// time complexity T(n)= O(1).