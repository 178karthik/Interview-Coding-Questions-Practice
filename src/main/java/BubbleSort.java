import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {

       Integer a[]={1,4,2,6,9,8};
       int n=a.length;
       for(int i=0;i<n-1;i++)
       {
           for(int j=0;j<n-i-1;j++)
           {
               if(a[j]>a[j+1])
               {
                   int temp = a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;
               }
           }
       }
       List<Integer> array= Arrays.asList(a);
       System.out.println(array);

    }
}