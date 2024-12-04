package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashmap {
    public static void main(String[] args) {

        String s = "aabbccdd";
        char nonrepeating =firstNonRepeatingCharacter(s);
        if(nonrepeating!=0) {
            System.out.println(nonrepeating);
        }
        else
        {
            System.out.println("Didn't find any non repeating charcter");
        }

    }

    public static char firstNonRepeatingCharacter(String s)
    {
        char c[] = s.toCharArray();


        Map<Character,Integer> hash= new LinkedHashMap<>();
        Integer count =1;
        for(int i=0;i<c.length;i++)
        {
            if(!hash.containsKey(c[i]))
            {
                hash.put(c[i],count);
            }
            else
            {
                hash.put(c[i],hash.get(c[i])+1);
            }
        }

        for(char i:hash.keySet())
        {
            if(hash.get(i)==1)
            {
                return i ;

            }
        }
        return 0;
    }
}
