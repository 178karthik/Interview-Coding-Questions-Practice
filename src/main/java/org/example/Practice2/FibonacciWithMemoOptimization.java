package org.example.Practice2;

import java.util.HashMap;
import java.util.Map;

public class FibonacciWithMemoOptimization {
    public static Map<Integer,Integer> hash = new HashMap<>();
    public static void main(String[] args) {

      int num =7;

      int fibonacciNumber = fib(num);
      System.out.println(fibonacciNumber);
    }

    public static int fib(int num)
    {
        if(num<=1)
        {
            return num;
        }
        if(hash.containsKey(num))
        {
            return hash.get(num);
        }
        int result = fib(num-1)+fib(num-2);

                hash.put(num,result);

        return result;
    }
}
