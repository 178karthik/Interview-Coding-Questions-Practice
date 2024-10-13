package org.example.Practice2;

import java.util.HashMap;
import java.util.Map;

public class AnagramWithHashMap{


    public static void main(String[] args) {
        String str1="darra";
        String str2 ="radar";
        String final1 =str1.replace("\s","").toLowerCase();
        String final2= str2.replace("\s","").toLowerCase();
        if (final1.length() != final2.length()) {
            System.out.println("Not an anagram (length mismatch)");
            return;
        }
        if(isAnagram(final1,final2))
        {
            System.out.println("Its a anagram");
        }
        else {
            System.out.println("Its not a anagram");
        }
    }
    public static boolean isAnagram(String str1,String str2)
    {
        Integer count =1;
        Map<Character,Integer> hash= new HashMap<>();
        for(int i=0; i<str1.length();i++)
        {
            char ch = str1.charAt(i);
            if(!hash.containsKey(ch))
            {
                hash.put(ch,count);
            }
            else
            {
                hash.put(str1.charAt(i), hash.get(ch)+1);
            }
        }

        for(int j=0;j<str2.length();j++)
        {
            char ch = str2.charAt(j);
            if(hash.containsKey(ch))
            {

                hash.put(ch,(hash.get(ch))-1);
            }
            if(hash.get(ch)==0)
            {
                hash.remove(ch);
            }
        }

        if(hash.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
