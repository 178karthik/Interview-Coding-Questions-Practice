package org.example.practice;

import java.util.*;

public class GroupOfAnagrams {


    public static void main(String[] args) {


        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        Map<String,List<String>> map =groupOfAnagram(strs);

        for(Map.Entry<String,List<String>> entry : map.entrySet())
        {
          System.out.println(entry.getValue());
        }



    }

    public static Map<String,List<String>>  groupOfAnagram(String[] str)
    {
        Map<String, List<String>> list = new HashMap<>();

        for(String s: str)
        {
            char c[] = s.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);
            if(!(list.containsKey(sorted)))
            {

                list.put(sorted,new ArrayList<>());
            }
                list.get(sorted).add(s);


        }
        return list;
    }


}



