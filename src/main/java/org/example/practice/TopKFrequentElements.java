package org.example.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {

    public static void main(String[] args) {
        int nums[] = new int[]{1, 2, 2, 3, 3, 3};
        int k = 2;

        int res[] = topKElements(nums, k);

        for(int r: res)
        {
            System.out.println(r);
        }

    }

    public static int[] topKElements(int nums[], int k) {
        Integer count = 1;

        int result[] = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!(map.containsKey(nums[i]))) {
                map.put(nums[i], count);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a, b) -> Integer.compare(b.getValue(), a.getValue()));

        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }

        return result;


    }
}


