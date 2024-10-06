package org.example.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramUsingHashmap {
    public static boolean  isAnagram(String str1, String str2) {

        str1 = str1.replaceAll("\s", "");
        str2 = str2.replaceAll("\s", "");
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length()!=str2.length())
        {
            return false;
        }

        char s1[] = str1.toCharArray();
        char s2[] = str2.toCharArray();

        Map<Character,Integer> map= new HashMap<>();
        Integer count=1;
        for(int i=0;i<s1.length;i++)
        {
            if(!map.containsKey(s1[i]))
            {
                map.put(s1[i],count);
            }
            else
            {
                map.put(s1[i],map.get(s1[i])+1);
            }
        }

        for(int j=0; j<s2.length;j++)
        {
            if(map.containsKey(s2[j]))
            {
                map.put(s2[j], map.get(s2[j])-1);
            }
            if(map.get(s2[j])==0)
            {
                map.remove(s2[j]);
            }
        }

        if(map.isEmpty())
        {
            return true;
        }
        return false;

    }

    public static void main(String[] args)
    {
        String s1 ="Silent";
        String s2 ="Listen";
        if(isAnagram(s1,s2))
        {
            System.out.println("It's anagram");
        }
        else {
            System.out.println("It's not a anagram");
        }
    }
}
