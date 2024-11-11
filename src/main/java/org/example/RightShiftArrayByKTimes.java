package org.example;

import java.util.Arrays;

public class RightShiftArrayByKTimes {
    public static void main(String[] args) {
        int a[]={1,3,5,8,9};
        int shift =3;
        int n = a.length-1;
        reverse(a,0,n);
        reverse(a,0,shift-1);
        reverse(a,shift,n);
        System.out.println(Arrays.toString(a));
    }

    public static void swap(int arr[],int left,int right)
    {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void reverse(int arr[],int left,int right)
    {
        while(left<right)
        {
            swap(arr,left,right);
            left++;
            right--;
        }
    }
}
