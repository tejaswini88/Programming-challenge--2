package com.teju.test;

import java.util.Scanner;

public class Palindrome
{
    static int i,c=0,res;

    static String stringreverse(String s,int l)
    {
    String reverse = "";

    	for ( int i = l - 1 ; i >= 0 ; i-- )
    	{
            reverse = reverse + s.charAt(i);

    	}return reverse;
    }

    public static void main (String args[])
    {
    	 System.out.println("input String: ");
         Scanner scan = new Scanner(System.in);
         String text=scan.nextLine();

       int length = text.length();

       String strRev= stringreverse(text,length);
       if(text.equals(strRev))
       {
    	   System.out.println(text+ "is palindrome");
       }
       else
       {
    	   System.out.println(text+ " is not palindrome");       }
    }
}