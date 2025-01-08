public class LongestCommonPrefix {
    public static void main(String[] args) {

        String str[] = {"flower", "flow", "flight"};

        System.out.println(longCommonPrefix(str));

    }
    public static String longCommonPrefix(String str[])
    {
        String prefix = str[0];


        for(String s: str)
        {
            while(s.indexOf(prefix)!=0)
            {
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }

        return prefix;

    }

}