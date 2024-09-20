package org.example;

public class CountOfVowelsAndConsonants {

   public static void main(String[] args)
   {
       String s="programming";
       int vowelCount =0;
       int consonantsCount =0;
       char c[] = s.toCharArray();

       for(int i=0;i<s.length();i++)
       {
           {
               if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
               {
                   vowelCount++;
               }
               else if(c[i]>'a' && c[i]<'z')
               {
                   consonantsCount++;
               }

           }
       }

       System.out.println("Vowels Count is"+vowelCount);
       System.out.println("Consonants Count is"+consonantsCount);
   }
}
