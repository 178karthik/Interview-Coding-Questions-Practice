import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeapOrTopkGreatestElements {
    public static void main(String[] args) {
        Integer arr[] = {1,4,6,8,5};
        int k=3;

        PriorityQueue pq= new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i< arr.length;i++)
        {
            pq.offer(arr[i]);
        }
        for(int i=0;i<k;i++)
        {
            System.out.println(pq.poll());
        }
    }
}
