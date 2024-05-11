package Introduction;

// Sum of a Geometric Series: S = [1 - r^(n+1)]/(1-r)
public class Geometric {

    static float geomsum(int a, int r, int n)
    {
        float sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum += a;
            a *= r;
        }
        return sum;
    }

    static float sumrecur(int a, int r, int n, int sum)
    {
        //Since the first term's sum is equal to 1
        //Tail Recursion: Recursive function call at the end of else statement
        if (n == 1)
        {
            return sum;
        }
        else
        {
            a *= r;
            sum += a;
            return sumrecur(a, r, n-1, sum);
        }
    }
    public static void main (String args[])
    {   
        //1 to 3, r = 2
        System.out.println(geomsum(1, 2, 9));
        System.out.println(sumrecur(1, 2, 9, 1));
    }
}
