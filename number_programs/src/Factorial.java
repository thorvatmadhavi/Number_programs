public class Factorial
{
    public int getFactorial(int n)
    {
        int fact = 1;

        for(int i = 2; i <= n; i++)
        {
            fact = fact * i;

        }
        return fact;
    }
    public static void main(String[] args)
    {
        int num = 5;
        Factorial obj = new Factorial();
        System.out.println("Factorial of " + num + " is " + obj.getFactorial(num));

    }
}