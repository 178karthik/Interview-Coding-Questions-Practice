package org.example;

public class PalindromeString {

    public static void main(String[] args) {

      String ispalindrome = "malayalam";
      int n= ispalindrome.length();
      char s[] = ispalindrome.toCharArray();
      String reverse = "";
      for(int i=n-1;i>=0;i--)
      {
         reverse= reverse+ ispalindrome.charAt(i);
      }
      System.out.println("The reverse of this string is"+reverse);
    }


}


