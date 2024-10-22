package org.example.Practice2;

import java.util.*;

public class TopKFrequentElements2 {
    public static void main(String[] args) {
        int nums[] = new int[]{1, 2, 2, 3, 3, 3};
        int k = 2;
        int result []= new int[k];
        Map<Integer,Integer> hash = new HashMap<>();
        Integer count =1;
        for(int n:nums)
        {
            if(!hash.containsKey(n))
            {
                hash.put(n,count);
            }
            else
            {
                hash.put(n, hash.get(n)+1);
            }
        }

        List<Map.Entry<Integer,Integer>> map = new ArrayList<>(hash.entrySet());

        map.sort((a,b)->Integer.compare(b.getValue(), a.getValue()));

        for(int i=0; i<k;i++)
        {
            result[i]=map.get(i).getKey();

        }

        System.out.println(Arrays.toString(result));


    }
}
