package org.example;

public class ToLowercaseWithoutUsingAnyInbuiltMethod {
    public static void main(String[] args) {


        String s = "HELLo";
        char c[]= s.toCharArray();

        StringBuilder sb = new StringBuilder();

        for(int i=0;i< c.length;i++)
        {
            if(c[i]>='A' && c[i]<='Z')
            {

                char r = (char) (c[i]+('a'-'A'));
                sb.append(r);
            }
            else
            {
                sb.append(c[i]);
            }
        }

        System.out.println(sb.toString());

    }
}
