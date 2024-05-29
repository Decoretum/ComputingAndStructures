package Introduction.Tasks;
import java.lang.Math.*;

//Count Digits in a Positive Integer Using Recursion
public class CountDigits {
    static float countdigits(double num, int res)
    {
        if (num == 0)
        {
            return res;
        }
        else
        {
            return countdigits(Math.floor(num / 10), res + 1);
        }
    }

    
    public static void main (String args[])
    {
        System.out.println(countdigits(2014891021, 0));
    }
}
