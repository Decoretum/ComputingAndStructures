package Introduction.Tasks;

import java.util.ArrayList;

public class FindPrimeDivisors {
    static String divisors(int num)
    {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        int divisor = 2;
        while (divisor < num)
        {
            //Check first if number is prime
            PositiveIntIsPrime temp = new PositiveIntIsPrime();
            boolean isprime = temp.isPrime(divisor);
            if (isprime)
            {
                if (num % divisor == 0)
                {
                    primes.add(divisor);
                }
            }
            divisor++;
        }

        if (primes.isEmpty())
            return num + " has no prime divisors";
        else
        {
            return "The prime divisors of " + num + " are " + primes;
        }
    }

    public static void main (String args[])
    {
        System.out.println(divisors(12));
    }
}
