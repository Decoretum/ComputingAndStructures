package StringsArraysChapter;
import java.lang.reflect.Array;
import java.util.*;

public class ShiftArray {

    //Without making a new array
    public static int[] shift(int[] a, int rotations)
    {

        //Shift based on rotations
        for (int i = 0; i < rotations; i++)
        {
            //Put last element to the first element position
            int lastTemp = a[a.length - 1];
            int firstTemp = a[0];
            a[0] = lastTemp;

            //At this point, firstTempt is in suspense
            //We first adjust the elements from the last to the 2nd to the first
            for (int j = a.length - 1; j > 1; j--)
            {
                a[j] = a[j - 1];
            }

            //We then append the first element ot the second position
            a[1] = firstTemp;

        }
        
        System.out.println(Arrays.stream(a).boxed().toList());
        return a;
    }

    public static void main (String args[])
    {
        int[] test = {1, 2, 3, 4, 5};
        System.out.println(shift(test, 4));
    }
}
