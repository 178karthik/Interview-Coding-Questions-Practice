package org.example;

public class equilibriumIndex {
    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};

        int index = getEquilibriumIndex(arr);
        if(index==-1)
        {
            System.out.println("Equilibrium Index not found");
        }
        else
        {
            System.out.println("Equilibrium Index found at "+index);
        }
    }

    public static int getEquilibriumIndex(int arr[])
    {

        int totalSum =0;
        int leftSum =0;

        for(int num:arr)
        {
            totalSum+=num;
        }

        for(int i=0; i<arr.length;i++)
        {
            totalSum-=arr[i];

            if(totalSum==leftSum)
            {
                return i;
            }

            leftSum+=arr[i];
        }

        return -1;

    }
}
