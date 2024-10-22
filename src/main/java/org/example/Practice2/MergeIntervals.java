package org.example.Practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{8, 10}, {1, 3}, {15, 18}, {2, 6}};
        int [][] mergedIntervals = mergrIntervals(intervals);
        for(int [] interval :mergedIntervals)
        {
            System.out.println(Arrays.toString(interval));
        }
    }

    public static int[][] mergrIntervals(int[][] intervals)
    {

        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));

        List<int[]> mergedIntervals = new ArrayList<>();
        int[] currentInterval = intervals[0];
        mergedIntervals.add(currentInterval);

        for(int[] interval :intervals)
        {
            int curentEnd= currentInterval[1];
            if(interval[0]<=curentEnd)
            {
                currentInterval[1]=Math.max(curentEnd,interval[1]);
            }
            else
            {
                currentInterval=interval;
                mergedIntervals.add(currentInterval);
            }
        }
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}
