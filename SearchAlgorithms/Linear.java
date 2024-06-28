package SearchAlgorithms;

public class Linear {
    
    public static int linear (int [] a, int n)
    {   
        for (int i = 0; i < a.length; i++)
        {
            int curr = a[i];
            if (curr == n)
            {
                return i;
            }
        }
        return -1;
    }
}
