package org.example.Practice2;

public class BinarySearch {

    public static void main(String[] args) {


        int a[]={1,3,5,7,9};
        int target=7;
       int index =  binary(a,target);
        if(index!=-1)
        {
            System.out.println(index);
        }
        else {
            System.out.println("Target not found");
        }



    }
    public static int binary(int a[],int target)
    {
        int left =0;
        int right= a.length-1;
        while(left<=right) {
            int middle = left + (right - left) / 2;
            if (a[middle] == target) {
                return middle;
            }
            if(a[middle]<target)
            {
                left = middle+1;
            }
            if(a[middle]>target)
            {
                right = middle-1;
            }

        }
        return -1;

    }
}
