package org.example.Practice2;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithNonRepeatingCharacters {

    public static void main(String[] args) {
        String input ="abcdde";

        Set<Character> seen = new HashSet<>();
        String longest ="";
        int start=0;

        for(int end=0;end<input.length();end++)
        {
            while(seen.contains(input.charAt(end)))
            {
                seen.remove(input.charAt(start));
                start++;
            }

            seen.add(input.charAt(end));


            if(end-start+1 > longest.length())
            {
                longest= input.substring(start,end+1);
            }
        }
        System.out.println("The Longest non repeating substring is:"+longest);

    }

}
