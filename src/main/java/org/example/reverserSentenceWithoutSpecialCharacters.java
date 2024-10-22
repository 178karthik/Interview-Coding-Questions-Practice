package org.example;

import org.example.Practice2.StringReverseWithoutSpecialCharacters;

public class reverserSentenceWithoutSpecialCharacters {

    public static void reverse(String s)
    {
        StringBuilder sb = new StringBuilder();
        String split[] = s.split(" ");
        for(String a: split)
        {
            sb.append(reverseWithoutCharacters(a)).append(" ");
        }
        System.out.println(sb);

    }

    public static void main(String[] args)
    {

        String str="I love abc$%d my country";
        reverse(str);

    }

    public static String reverseWithoutCharacters(String str)
    {
        char strarr[] = str.toCharArray();

        int left =0;
        int right = strarr.length-1;

        while(left<=right)
        {

            if(!isCharacter(strarr[left]))
            {
                left++;
            }
            else if (!isCharacter(strarr[right]))
            {
                right--;
            }
            else {
                char temp = strarr[left];
                strarr[left]= strarr[right];
                strarr[right]= temp;
                left++;
                right--;
            }
        }
        String reversed = new String(strarr);
        return reversed;
    }

    public static boolean isCharacter(char ch)
    {

       return  Character.isLetter(ch);
    }
}
