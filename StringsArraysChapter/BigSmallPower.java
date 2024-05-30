package StringsArraysChapter;
import java.lang.Math.*;

public class BigSmallPower {

    /*
    find the largest number powk such that k**powk <= num
    find the smallest number powk such that k**powk >= num

    Speculation:
    log n, base k = e


     */

    static int[] findBounds(int num, int base)
    {
        int power = 2;
        while (power <= num)
        {
            power *= base;
        }

        if (power > num)
        {
            power /= base;
        }

        int[] res = {(int) power, (int) power * base};
        System.out.println("Power of base: " + power);
        return res;
    }
    
    public static void main (String args[])
    {
        int[] res = findBounds(24, 2);
        System.out.println("Base: " + 2 + " Number: " + 24 + " Lower: " + res[0] + " Upper: " + res[1]);
    }
}
