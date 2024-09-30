package org.example;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {

        String str[] = {"flower", "flow", "flight"};

        System.out.println(longCommonPrefix(str));

    }
    public static String longCommonPrefix(String str[])
    {
        String prefix = str[0];

        for(int i=0;i<str.length;i++)
        {
            if(str[i].indexOf(prefix)!=0)
            {
                prefix = prefix.substring(0, str.length-1);
            }
        }

        return prefix;

    }

}