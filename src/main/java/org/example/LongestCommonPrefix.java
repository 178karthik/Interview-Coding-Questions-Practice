package org.example;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String s1 ="Silent";
        String s2 ="Listen";
        if(isAnagram(s1,s2))
        {
            System.out.println("It's a Anagram");
        }
        else
        {
            System.out.println("It's not a Anagram");
        }


    }

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
        Arrays.sort(s1);
        Arrays.sort(s2);

       boolean flag =  Arrays.equals(s1,s2);
       return flag;

    }
}