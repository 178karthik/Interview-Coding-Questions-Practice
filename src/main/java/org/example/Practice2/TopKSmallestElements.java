package org.example.Practice2;

import java.util.Arrays;
import java.util.PriorityQueue;

public class TopKSmallestElements {
    public static void main(String[] args) {
        Integer arr[] = {1,4,0,7,2};

        PriorityQueue<Integer> pq= new PriorityQueue<>(Arrays.asList(arr));

        for(int i=0; i<2;i++)
        {
            System.out.println(pq.poll());
        }

    }
}
