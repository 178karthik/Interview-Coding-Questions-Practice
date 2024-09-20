package org.example;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
    public static void main(String[] args) {

       String s = "programming";

       char c[]= s.toCharArray();

        Map<Character,Integer> hash = new HashMap<>();
        Integer count =1;
        for(int i=0;i<c.length;i++)
        {
            if(!(hash.containsKey(c[i])))
            {
                hash.put(c[i],count);
            }
            else {
                hash.put(c[i],hash.get(c[i])+1);
            }
        }

      for(char c1: hash.keySet())
      {
          if(hash.get(c1)>1)
          {
              System.out.println(c1);
          }
      }

    }
}