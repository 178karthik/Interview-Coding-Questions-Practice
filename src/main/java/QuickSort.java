public class QuickSort {

    public static void main(String[] args)
    {

        int arr[] = {1,4,5,89,0,2,7};
        // Start the quicksort process
        quicksort(arr, 0, arr.length - 1);

        // Print sorted array
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static void quicksort(int a[],int low,int high)
    {
         if(low<high) {
             int pivotIndex = partition(a, low, high);
             quicksort(a, 0, pivotIndex - 1);
             quicksort(a, pivotIndex + 1, high);
         }
    }

    public static int partition(int a[],int low,int high )

    {
       int pivot= a[high] ;

       int leftpointer = low;

       int rightpointer= high;

       while(leftpointer<rightpointer) {

           while (a[leftpointer] <= pivot && leftpointer < rightpointer) {
               leftpointer++;
           }
           while (a[rightpointer] >= pivot && leftpointer < rightpointer) {
               rightpointer--;
           }
          swap(a, leftpointer, rightpointer);


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
