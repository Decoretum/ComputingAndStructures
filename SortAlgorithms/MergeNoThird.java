package SortAlgorithms;
import java.lang.Math;
import java.util.Arrays;
import java.util.*;

//Assuming both arrays are sorted

public class MergeNoThird {
   public static int[] merge (int[]a, int[]b) //a is receiving, b is transferring
   {
      int i = 0; //a

      for (int j = 0; j <= b.length - 1; j++) //Traverse b's elements
      {
         while (a[i] < b[j] && a[i] != 0)
         {
            i++;
         }

         //i will be the index where b[j] will be

         //Shifting elements to the right
         for (int k = a.length - 1; k >= i + 1; k--)
         {
            int back= a[k - 1];
            a[k] = back;
         }

         //Put value from b to position in a array
         a[i] = b[j]; 
      }

      return a;
      
   }

   public static void main (String args[])
   {
      int [] t = {1, 3, 9, 10, 0, 0, 0, 0};
      int [] u = {5, 10, 20, 24};

      int [] newArray = merge(t, u);
      System.out.println(Arrays.stream(newArray).boxed().toList());
   }
}