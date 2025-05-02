public class PrimeNumber {
    public boolean getPrimeNumber(int n)
    {
        if(n<=1)
        {
            return false;
        }
        for(int i=2; i<n; i++)
        {
            if(n%i == 0)
            {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args)
    {
        System.out.println("Prime numbers between 1 to 100: ");
        PrimeNumber obj = new PrimeNumber();
        for(int i=1; i<=100; i++) {
            if (obj.getPrimeNumber(i)) {
                System.out.print(i + " " );
            }


        }

    }
}
