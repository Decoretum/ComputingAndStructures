package Introduction.Tasks;

//Determine if a positive integer is a prime
public class PositiveIntIsPrime {
    
    public boolean isPrime(int num)
    {
        int divisor = 2;
        while (divisor < num)
        {
            if (num % divisor != 0)
            {
                divisor++;
            }
            else
            {
                return false;
            }
        }

        return true;

    }
}
