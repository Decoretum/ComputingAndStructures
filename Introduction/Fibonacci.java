package Introduction;

public class Fibonacci {
    static float recur(int num)
    {
        if (num == 0)
        {
            return 0;
        }
        else if (num == 1)
        {
            return 1;
        }
        else
        {
            return recur(num - 1) + recur(num - 2);
        }
    }
    public static void main (String args[])
    {
        System.out.println(recur(9));
    }
}
