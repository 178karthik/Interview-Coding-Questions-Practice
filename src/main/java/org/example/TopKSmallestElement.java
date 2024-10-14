package org.example;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

public class TopKSmallestElement {
    public static void main(String[] args) {

        Integer arr[] = {1,4,6,8,5};
        int k=3;

        PriorityQueue<Integer> a= new PriorityQueue<>(Arrays.asList(arr));

        for(int i=0; i<k ;i++)
        {
           System.out.println(a.poll());
        }

    }
}
