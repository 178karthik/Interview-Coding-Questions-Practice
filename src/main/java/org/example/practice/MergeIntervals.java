package org.example.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {


    public static void main(String[] args)
    {

          int[][] intervals = {{8, 10}, {1, 3}, {15, 18}, {2, 6}};

          int merged[][] = mergeIntervals(intervals);

          for(int interval[]:merged)
          {
              System.out.println(Arrays.toString(interval));
          }

    }

    public static int[][] mergeIntervals(int intervals[][]) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int currentInterval[] = intervals[0];

        List<int[]> mergedIntervals = new ArrayList<>();
        mergedIntervals.add(currentInterval);

        for (int interval[] : intervals) {
            int currentend = currentInterval[1];

            if (interval[0] <= currentend) {
                currentInterval[1] = Math.max(currentend, interval[1]);
            } else {
                currentInterval = interval;
                mergedIntervals.add(currentInterval);
            }

        }
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);


    }

}
