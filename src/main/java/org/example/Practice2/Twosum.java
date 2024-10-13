package org.example.Practice2;

import java.util.ArrayList;
import java.util.List;

public class Twosum {
    public static void main(String[] args) {
        int[] nums = {2,5,8,7};
        int target = 7;
        List<Integer> indexes = new ArrayList<>();
        for(int i=0; i< nums.length;i++)
        {
            for(int j=i+1; j< nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    indexes.add(i);
                    indexes.add(j);
                    break;
                }
            }
            if(indexes.isEmpty())
            {
                break;
            }
        }
        System.out.println(indexes.toString());
    }


}
