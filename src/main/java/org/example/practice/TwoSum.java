package org.example.practice;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {

    public static void main(String[] args) {


        int[] nums = {2,5,8};

        List<Integer> indexes = new ArrayList();

        int target = 10;


        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                if((nums[i]+nums[j])==target)
                {
                    indexes.add(i);
                    indexes.add(j);
                    break;
                }
            }
            if(!indexes.isEmpty())
            {
                break;
            }
        }

        System.out.println(indexes.toString());

    }
}
