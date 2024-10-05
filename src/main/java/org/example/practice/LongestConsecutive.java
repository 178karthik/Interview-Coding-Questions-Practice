package org.example.practice;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutive {

    public static void main(String[] args) {
     int arr[]={0,1,6,-1};
     int longest= longestConsecutive(arr);
     System.out.println("The Longest is :"+longest);
    }

    public static int longestConsecutive(int arr[])
    {

        Map<Integer,Boolean> map = new HashMap<>();
        int longestLength =0;

        for(int i :arr)
        {
            map.put(i,Boolean.FALSE);
        }

        for(int num:arr)
        {
            int currentLength=1;

            int nextNum = num+1;

            while(map.containsKey(nextNum) && map.get(nextNum)==false)
            {
                currentLength++;
                map.put(nextNum,Boolean.TRUE);
                nextNum++;
            }


            int prevNum =num-1;

            while(map.containsKey(prevNum) && map.get(prevNum)==false)
            {
                currentLength++;
                map.put(prevNum,Boolean.TRUE);
                prevNum--;
            }

            longestLength=Math.max(currentLength,longestLength);
        }
        return longestLength;

    }
}
