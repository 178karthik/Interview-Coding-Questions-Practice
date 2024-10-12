package org.example.Practice2;

public class QuickSort {

    public static void main(String[] args)
    {

        int a[] ={3,5,1,9,0};
        int low =0;
        int high = a.length-1;
        quickSort(a,low,high);

        for(int i : a)
        {
            System.out.println(i);
        }

    }
    public static void quickSort(int a[],int low,int high)
    {
        if(low<high) {
            int pivotIndex = partition(a, low, high);
            quickSort(a, low, pivotIndex - 1);
            quickSort(a, pivotIndex + 1, high);
        }
    }
    public static int partition(int a[],int low,int high)
    {

        int leftpointer = low;
        int rightpointer = high;
        int pivot = a[high];

        while(leftpointer<rightpointer)
        {
            while(a[leftpointer]<=pivot && leftpointer<rightpointer)
            {
                leftpointer++;
            }
            while(a[rightpointer]>=pivot && leftpointer<rightpointer)
            {
                rightpointer--;
            }
            swap(a,leftpointer,rightpointer);


        }
        swap(a,leftpointer,high);

        return leftpointer;
    }
    public static void swap(int a[],int low,int high)
    {

        int temp = a[low];
        a[low]=a[high];
        a[high]=temp;
    }

}
