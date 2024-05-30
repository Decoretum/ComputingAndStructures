package Introduction.Tasks;

public class GCD { //Greatest Common Divisor
    public static double gcd(double n1, double n2)
    {
        if (n1 % n2 == 0)
        {
            return n2;
        }
        else if (n1 > n2)
        {
            return gcd(n2, n1);
        }
        else {
            return gcd(n1, n2-n1);
        }
    }

    public static void main (String args[])
    {
        System.out.println(gcd(13.0, 4.0));
    }
}
