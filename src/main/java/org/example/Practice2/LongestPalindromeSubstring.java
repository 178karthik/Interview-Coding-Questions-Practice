package org.example.Practice2;

public class LongestPalindromeSubstring {

    public static void main(String[] args) {

        String palindrome ="babad";

        String longestPalindrome= longestPalindromeSubstring(palindrome);
        System.out.println(longestPalindrome);
    }
    public static boolean isPalindrome(String str, int low, int high)
    {
        if(low==high)
        {
            return true;
        }
        if(str.charAt(low)!=str.charAt(high))
        {
            return false;
        }

        return isPalindrome(str,low+1,high-1);
    }

    public static String longestPalindromeSubstring(String str)
    {
        String longest= "";
        for(int i=0;i<str.length();i++)
        {
            for(int j=i; j<str.length();j++)
            {
                 String substr = str.substring(i,j+1);
                 if(isPalindrome(substr,0,substr.length()-1) && substr.length()>longest.length())
                 {
                     longest= substr;
                 }
            }
        }
        return longest;
    }
}
