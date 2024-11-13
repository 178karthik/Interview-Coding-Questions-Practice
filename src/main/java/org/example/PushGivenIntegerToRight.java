package org.example;

import java.util.ArrayList;
import java.util.List;

public class PushGivenIntegerToRight {
    public static void main(String[] args) {

        int a[]= {1,2,0,2,1,0,2,1};

        List<Integer> result = new ArrayList<>();
        int k=0;

        for(int i:a)
        {
            if(i!=1)
            {
                result.add(i);
            }
            else
            {
                k++;
            }
        }
        System.out.println(k);
        for(int i=0;i<k;i++)
        {
            result.add(1);
        }
        System.out.println(result.toString());

//        while(k<a.length-1)
//        {
//            result.add(1);
//        }





    }
}
