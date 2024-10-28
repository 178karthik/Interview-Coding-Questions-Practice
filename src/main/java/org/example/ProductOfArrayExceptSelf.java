package org.example;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int arr[] = {2, 1, 2, 3};
        int product[] = new int[arr.length];
        Arrays.fill(product,1);

        for(int i=0;i< arr.length;i++)
        {
            for (int j=0;j< arr.length;j++)
            {
                if(i!=j) {
                    product[j] *= arr[i];
                }
            }
        }

        System.out.println(Arrays.toString(product));


    }
}
