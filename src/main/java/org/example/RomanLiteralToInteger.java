package org.example;

import java.util.HashMap;
import java.util.Map;

public class RomanLiteralToInteger {
    public static void main(String[] args) {
        String roman= "VII";
        String romanUpperCase = roman.toUpperCase();
        Map<Character,Integer> hash = new HashMap<>();
        hash.put('X',10);
        hash.put('I',1);
        hash.put('C',100);
        hash.put('V',5);
        hash.put('L',50);
        hash.put('D',500);
        hash.put('M',1000);

        int total =0;
        int prev =0;

        int n= roman.length()-1;
        for(int i=n;i>=0;i--)
        {

            char currentChar = romanUpperCase.charAt(i);
            int currentValue = hash.get(currentChar);

            if(currentValue<prev)
            {
                total-= currentValue;
            }
            else
            {
                total+=currentValue;
            }
            prev=currentValue;

        }

        System.out.println("The Numerical value is "+total);


    }

}
