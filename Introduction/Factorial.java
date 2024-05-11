package Introduction;

public class Factorial {
    static float iter(int n)
    {
        //from 1 to n
        float prod = 1;
        for (int i = 1; i <= n; i++)
        {
            prod *= i;
        }
        return prod;
    }

    static float recur(int n)
    {
        if(n == 1)
        {
            return n;
        }
        else //Decrease n, pre-cursor recursion (since you're just waiting for the stack to finish)
        {
            return n * (recur(n-1));
        }
    }

    static float recurtail(int n, float product)
    {
        if (n == 1)
        {
            return product;
        }
        else
        {
            return recurtail(n - 1, product * n);
        }
    }

    public static void main (String args[])
    {
        System.out.println(iter(4));
        System.out.println(recur(4));
        System.out.println(recurtail(4, 1));
    }
}
