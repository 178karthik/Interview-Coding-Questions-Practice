package org.example;

public class StringToIntegerWithoutUsingInbuiltMethod {
    public static void main(String[] args) {
        String s="1234";
        char c[] = s.toCharArray();
        int result=0;
        for(int i=0;i<c.length;i++)
        {
            int digit = (c[i] - '0');
            result= result*10+digit;
        }

        System.out.println(result);
    }
}
