package org.example;
import java.util.*;

public class Threesum {
    public static void main(String[] args) {

        int nums[] = {1, 1, 2, 2, 3, 3, 4, 4, 5};
        int target = 6;

        List<List<Integer>> result= triplet(nums,6);

        System.out.println(result.toString());


    }
    public static List<List<Integer>> triplet(int nums[],int target)
    {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2;i++)
        {
            int left =i+1;
            int right = nums.length-1;

            while(left<right)
            {
                int sum= nums[i]+nums[left]+nums[right];
                if(sum==target)
                {
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                }

                 if(sum<target)
                {
                    left++;
                }
                if(sum>target)
                {
                    right--;
                }

            }

        }
        return new ArrayList<>(result);
    }
}
