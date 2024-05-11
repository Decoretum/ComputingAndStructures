package Introduction;

//arithmetic sum of the first n positive integers:
// S = n * (n + 1) / 2
public class PartialArithSeries {
    
    public static int Iterative(int i, int j) //partial sum from i to j, i <= j
    {
        if (i > j)
        {
            return 0;
        }
        else
        {   // (Partial Sum of J) - (Partial Sum of I - 1)
            return (j * (j + 1) / 2) - ((i-1) * (i) /2);
        }
    }
    public static void main (String args[])
    {
        System.out.println(Iterative(2, 3));
        System.out.println(Iterative(2, 6));
    }
}
