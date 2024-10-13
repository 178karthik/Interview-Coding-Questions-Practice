package org.example.Practice2;

public class StringReverseWithoutSpecialCharacters {
    public static void main(String[] args) {
        String s= "abc$%d";
        String reversed = reverse(s);
        System.out.println(reversed);
    }
    public static String reverse(String str) {

        char c[] = str.toCharArray();
        int left = 0;
        int right = c.length - 1;

        while (left < right) {
            if (!isCharacter(c[left]))
            {
                left++;
            }
           else if(!isCharacter(c[right]))
            {
                right--;
            }
           else {
                char temp = c[left];

                c[left] = c[right];
                c[right] = temp;
                left++;
                right--;
            }
        }
        String reversed = new String(c);
        return reversed;
    }


    public static boolean isCharacter(char ch)
    {

        return Character.isLetter(ch);
    }
}

