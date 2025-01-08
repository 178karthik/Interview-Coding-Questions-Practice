public class reverseWordsInString {
    public static void main(String[] args) {
          String sentence ="Hello world jenkins";
          StringBuilder reversed = new StringBuilder();

          String words[] =sentence.split(" ");
          for(String word: words)
          {
              reversed.append(reverse(word)).append(" ");
          }

          System.out.println(reversed.toString());


    }
    public static String reverse(String word)
    {
        StringBuilder stringBuilder   = new StringBuilder();

       for(int i=word.length()-1;i>=0;i--)
       {
           stringBuilder.append(word.charAt(i));
       }
       return  stringBuilder.toString();
    }
}
