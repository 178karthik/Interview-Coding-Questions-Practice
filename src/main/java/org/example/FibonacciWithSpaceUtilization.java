package org.example;

import java.util.HashMap;
import java.util.Map;

public class FibonacciWithSpaceUtilization {

    public static int  fib(int number)
    {

        if(number<=1)
        {
            return number;
        }
        int prev1 = 1;

        int prev2 = 0;


   for(int i=2;i<=number;i++) {

       prev1 = prev1 + prev2;
       prev2 = prev1 - prev2;
   }

       return prev1;


    }
    public static void main(String[] args) {
        int number = 0;
        System.out.println(fib(number));

    }
}
