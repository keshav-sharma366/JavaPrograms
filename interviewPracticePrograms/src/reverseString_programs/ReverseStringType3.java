package reverseString_programs;

import java.util.Scanner;

public class ReverseStringType3 {
	  // This method is used to reverse the given String
	public static String reverse(String str)
	{
		 // Initially, rev is an empty String
        // We will keep adding characters into this String
	String rev="";
	 /** Start loop from the last index of the String
     str.length() - 1 gives the last index
     Example: "selenium" length = 8, last index = 7
    
     i >= 0 means loop will continue until index 0
     i-- means move from right to left
     **/
	
	for(int i=str.length()-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
	}
	return rev;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string you want to reverse");
		String str=sc.next();
	//	String str="selenium";
		System.out.println("Original String was "+str);
		 // Call reverse() method
        // Pass str as an argument
		System.out.println("Reversed String is "+reverse(str));
		
	}


}
/**
 * tracing of string
String = selenium

Index:
 s   e   l   e   n   i   u   m
 0   1   2   3   4   5   6   7

i = 7 → m → rev = "m"
i = 6 → u → rev = "mu"
i = 5 → i → rev = "mui"
i = 4 → n → rev = "muin"
i = 3 → e → rev = "muine"
i = 2 → l → rev = "muinel"
i = 1 → e → rev = "muinele"
i = 0 → s → rev = "muineles"

*/
