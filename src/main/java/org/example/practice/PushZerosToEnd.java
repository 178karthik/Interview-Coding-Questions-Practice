package org.example.practice;

import java.util.Arrays;

public class PushZerosToEnd {

    public static void main(String[] args) {
        int arr[] = {1, 0, 3, 2, 5, 9, 0, 2, 0};
        int res[] = new int[arr.length];

        int n = arr.length;
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                res[k++] = arr[i];
            }

        }

      while(k<n)
      {
          res[k++]+=0;
      }
        System.out.println(Arrays.toString(res)); // Print the result array

    }
}
