package org.example.Practice2;

import java.util.*;

public class GroupOfAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        Map<String,List<String>> map = groupOfAnagrams(strs);
        for(Map.Entry<String,List<String>> entry:map.entrySet())
        {
            System.out.println(entry.getValue());
        }
    }
    public static boolean isAnagram(String str1,String str2){
        String s1= str1.toLowerCase();
        String s2 = str2.toLowerCase();
        char c1[] =s1.toCharArray();
        char c2[] = s2.toCharArray();
        if(c1.length!=c2.length)
        {
            return false;
        }
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);

    }


    public static Map<String,List<String>> groupOfAnagrams(String[] strs)
    {
        Map<String, List<String>> hash = new HashMap<>();
        for(String str:strs){
            char ch[] = str.toCharArray();
             Arrays.sort(ch);
             String sorted = new String(ch);
             if(!hash.containsKey(sorted))
             {
                 hash.put(sorted,new ArrayList<>());
             }
             hash.get(sorted).add(str);
        }
        return hash;




    }
}
