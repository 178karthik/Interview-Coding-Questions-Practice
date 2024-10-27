package org.example.Practice2;

import java.math.MathContext;
import java.util.HashMap;
import java.util.Map;

public class LongestConsecutivePractice2 {
    public static void main(String[] args) {
        int arr[]={0, 1, 8, 10};
        Map<Integer,Boolean> hash = new HashMap<>();
        for(int i: arr)
        {
            hash.put(i,Boolean.FALSE);
        }

        int consecutiveLength=0;
        for(int num:arr)
        {
            int nextnum= num+1;
            int currentLength=1;

            while(hash.containsKey(nextnum) && hash.get(nextnum)==false)
            {
                currentLength=currentLength+1;

                nextnum=nextnum+1;
                hash.put(nextnum,Boolean.TRUE);
            }

            int prevnum= num-1;
            while(hash.containsKey(prevnum) && hash.get(prevnum)==false)
            {
                currentLength=currentLength+1;
                prevnum=prevnum-1;
                hash.put(prevnum,Boolean.TRUE);
            }
            consecutiveLength=  Math.max(consecutiveLength,currentLength);
        }
        System.out.println(consecutiveLength);
    }
}

