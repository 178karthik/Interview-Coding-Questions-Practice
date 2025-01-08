public class PalindromeStringWithRecursion {

    public static boolean isPalindrome(String input,int start,int end)
    {
        if(start==end)
        {
            return true;
        }
        if(input.charAt(start)!=input.charAt(end))
        {
            return false;
        }
        return isPalindrome(input,start+1,end-1);
    }

    public static void main(String[] args) {

        String ispalindrome = "radar";
        int start =0;
        int end = ispalindrome.length()-1;
        System.out.println(isPalindrome(ispalindrome,start,end));



    }


}


