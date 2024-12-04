package org.example;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutive {
    public static void main(String[] args) {
        int arr[]={0, 1,2, 8, 10};
        System.out.println(longestConsecutive(arr));
    }

    public static int longestConsecutive(int arr[])
    {
        Map<Integer,Boolean> map = new HashMap<>();
        for(int i:arr)
        {
            map.put(i,Boolean.FALSE);
        }
        int consecutiveLength=0;
    for(int num:arr)
    {
        int nextNum= num+1;
        int currentLength =1;
        while(map.containsKey(nextNum) && map.get(nextNum)==false)
        {
            currentLength++;
            map.put(nextNum,Boolean.TRUE);
            nextNum=nextNum+1;
        }
        int prevNum = num-1;
        while(map.containsKey(prevNum) && map.get(prevNum)==false )
        {
            currentLength++;
            map.put(prevNum,Boolean.TRUE);
            prevNum= prevNum-1;
        }

        consecutiveLength=Math.max(currentLength,consecutiveLength);

    }
    return consecutiveLength;
    }
}
