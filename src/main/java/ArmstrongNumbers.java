public class ArmstrongNumbers {

   public static void main(String[] args)
   {
       int num= 153;
       int armstrongnumber =153;
       int  sum=0;
       while(num>0)
       {

           int digit = num%10;
           sum= (int) (sum+(Math.pow(digit,3)));
           num=num/10;
       }

      if(armstrongnumber==sum)
      {
          System.out.println("It'a armstrong number");
      }
      else
      {
          System.out.println("It's not a armstrong number");
      }
   }
}
