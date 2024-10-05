package org.example.practice;

import java.util.HashSet;
import java.util.Set;

public class longestSubstringWithNonRepeatingCharacters {


    public static void main(String[] args) {

        String input= "pwwkew";

        String longest = "";

        int start=0;

        Set<Character> seen = new HashSet<>();

        for(int end=0;end<input.length();end++)
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
