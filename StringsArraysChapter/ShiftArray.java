package StringsArraysChapter;
import java.util.*;

public class ShiftArray {

    //Without making a new array
    public static int[] shift(int[] a, int rotations, String LorR)
    {

        if (LorR.equals("R"))       
        {
            //Shift based on rotations
            for (int i = 0; i < rotations; i++)
            {
                //Put last ELEMENT to the first element position
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
        } 
        else  
        {
            for (int i = 0; i < rotations; i++)
            {
                //Put first element to the last position
                int firstTemp = a[0];
                int lastTemp = a[a.length - 1];
                a[a.length - 1] = firstTemp;

                //At this point, lastTemp is in suspense
                //Move elements in the middle from right to left
                for (int j = 0; j < a.length - 1; j++)
                {
                    a[j] = a[j + 1];
                }

                a[a.length - 2] = lastTemp;
            }
        }
        
        
        System.out.println(Arrays.stream(a).boxed().toList());
        return a;
    }

    public static void main (String args[])
    {
        int[] test = {1, 2, 3, 4, 5};
        System.out.println(shift(test, 2, "L"));
    }
}
