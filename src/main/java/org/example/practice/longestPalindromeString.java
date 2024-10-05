package org.example.practice;

import java.util.HashSet;
import java.util.Set;

public class longestPalindromeString {


    public static void main(String[] args) {

        String s = "radar";

       String longest= longestPalindrome(s);

       System.out.println("The longest Plaindrome is :"+longest);


    }

    public static boolean isPalindrome(String str,int start,int end)
    {

        if(start==end)
        {
            return true;
        }
        if(str.charAt(start)!=str.charAt(end))
        {
            return false;
        }

        return isPalindrome(str,start+1,end-1);
    }

    public static String longestPalindrome(String str)
    {

        String longest = "";
        for(int i=0; i<str.length();i++)
        {
            for(int j=i; j<str.length();j++) {


                String substr = str.substring(i, j + 1);
                if (isPalindrome(str, 0, substr.length()-1) && substr.length() > longest.length()) {
                    longest = substr;
                }
            }
        }
        return longest;

    }
}
