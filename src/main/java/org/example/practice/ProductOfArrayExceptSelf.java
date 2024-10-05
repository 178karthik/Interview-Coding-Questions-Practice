package org.example.practice;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {


    public static void main(String[] args) {

        int arr[] = {0, 1, 2, 3};
        int n=arr.length;
        int prod[]=new int[n];

        Arrays.fill(prod,1);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                {
                    prod[j]*=arr[i];
                }
            }
        }

        System.out.println(Arrays.toString(prod));

    }
}
