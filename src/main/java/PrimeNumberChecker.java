public class PrimeNumberChecker {
    public static void main(String[] args) {


        int number = 3;
        if(isPrime(number))
        {
            System.out.println("It's a prime number");

        }
        else
        {
            System.out.println("It's not a prime number");
        }


    }
    public static boolean isPrime(int num)
    {
        boolean flag = true;
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return flag;
    }
}