package org.example.Practice2;

public class quicksort2 {
    public static void main(String[] args) {
        int a[]={1,6,0,3,10,99,7};
       quicksort(a,0,a.length-1);
       for(int i:a)
       {
           System.out.println(i);
       }

    }
    public static void quicksort(int a[],int low,int high)
    {
        if(low<high)
        {
            int pivotindex= partition(a,low,high);
            quicksort(a,low,pivotindex-1);
            quicksort(a,pivotindex+1,high);
        }
    }
    public static void swap(int a[],int low,int high)
    {
        int temp=a[low];
        a[low]=a[high];
        a[high]=temp;
    }
    public static int partition(int a[],int low,int high)
    {

        int leftpointer= low;
        int rightpointer=high;
        int pivot= a[high];

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
   return  leftpointer;
    }

}
