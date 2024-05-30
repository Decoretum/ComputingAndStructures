package StringsArraysChapter;

//Multiply and Divide by Recursin (huh)
public class MultiplyDivideRecursion {
    public static double recurM(double num, double times)
    {
        //pre-cursor recursion
        if (times == 1)
        {
            return num;
        }
        else
        {
            return num + recurM(num, times - 1);
        }
    }

    public static double recurD(double num, double result, double divisor, double times)
    {
        //tail recursion
        if (result == divisor)
        {
            return times;
        }

        else
        {  
            return recurD(num, result - divisor, divisor, times + 1);
        }
    }
    public static void main (String args[])
    {
        System.out.println(recurM(4, 5));
        System.out.println(recurD(81, 81, 9, 1));
    }
}
