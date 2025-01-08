public class LongestPalindromeString {

    public static void main(String[] args) {

      String s = "babad";
      System.out.println(longestPalindrome(s));

    }
    public static boolean isPalindrome(String str, int start,int end)
    {
       char c[] = str.toCharArray();
       if(start==end)
       {
           return true;
       }

       if(c[start]!=c[end])
       {
           return false;
       }

       return isPalindrome(str,start+1,end-1);

    }
    public static String  longestPalindrome(String str)
    {
        String longest = "";

        for(int i =0; i<str.length();i++){

            for(int j=i; j<str.length();j++)
            {
                String substring = str.substring(i,j+1);
                if(isPalindrome(substring,0,substring.length()-1) && substring.length()>longest.length())
                {
                    longest = substring;
                }
            }
        }

        return longest;



    }


}


