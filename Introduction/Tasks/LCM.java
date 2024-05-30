package Introduction.Tasks;

public class LCM {
    static double lcm(int n1, int n2)
    {
        return (n1 * n2) / GCD.gcd(n1, n2);
    }

    public static void main (String args[])
    {
        System.out.println(lcm(10, 24));
    }
}
