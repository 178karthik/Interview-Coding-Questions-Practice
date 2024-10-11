package org.example;

public class reverseStringWithoutSpecialCharacters {

    public static void main(String[] args)
    {

        String str="abc$%d";
        System.out.println(reverseWithoutCharacters(str));

    }

    public static String reverseWithoutCharacters(String str)
    {
        char strarr[] = str.toCharArray();

        int left =0;
        int right = strarr.length-1;

        while(left<right)
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
