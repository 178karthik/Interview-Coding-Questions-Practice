public class Factorial {

    public static void main(String[] args) {
        int number = 5;
        System.out.format("The Factorial of is %d is %d",number,factorial(number));
    }
    public static int factorial(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n*factorial(n-1);
    }

}
