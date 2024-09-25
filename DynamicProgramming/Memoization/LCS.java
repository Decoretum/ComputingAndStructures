package DynamicProgramming.Memoization;

import java.math.BigInteger;

// 2D Memoization
public class LCS {

    static long[][] lcsStorage;

    public static int getMax(int a, int b)
    {return (a < b) ? b : a;}
    
    public static int lcs1D(String A, String B, int a, int b)
    {
        if (a < 0 || b < 0) 
        return 0;

        else if (A.charAt(a) == B.charAt(b))
        {
            return 1 + lcs1D(A, B, a - 1, b - 1);
        } 
        // If the 2 chars aren't equal to one another
        return getMax(lcs1D(A, B, a - 1, b), lcs1D(A, B, a, b - 1));
        
    }

    public static long lcs1DMemo(String A, String B, int a, int b)
    {
        if (a < 0 || b < 0) 
        return 0;

        else if (lcsStorage[a][b] != 0)
        {
            System.out.println("Storage element found!");
            return lcsStorage[a][b];
        }
        
        else if (A.charAt(a) == B.charAt(b))
        {
            return 1 + lcs1D(A, B, a - 1, b - 1);
        } 

        // If the 2 chars aren't equal to one another
        System.out.println("Not found in table, so will calculate once");
        return lcsStorage[a][b] = getMax(lcs1D(A, B, a - 1, b), lcs1D(A, B, a, b - 1));
    }

    public static void main (String args[])
    {
        String a = "AXYT";
        String b = "AYZX";
        lcsStorage = new long[a.length()][b.length()];
        System.out.println(lcs1DMemo(a, b, a.length() - 1, b.length() - 1));
    }
}
