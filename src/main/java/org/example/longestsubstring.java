package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class longestsubstring {
    public static void main(String[] args) {

      String input= "pwwkew";
      Set<Character> seen = new HashSet<>();
      String longest="";
      int start=0;
      int n= input.length();
      for(int end=0;end<n;end++)
      {
          while(seen.contains(input.charAt(end)))
          {
              seen.remove(input.charAt(start));
              start++;
          }
          seen.add(input.charAt(end));
          if(end-start+1>longest.length())
          {
              longest = input.substring(start,end+1);
          }
      }

      System.out.println(longest);

    }
}