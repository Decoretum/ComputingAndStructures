package StringsArraysChapter;

import java.math.BigDecimal;
import java.util.Arrays;

//Sort an array containing elements of "0", "1", and "2" without using another data structure
//O(n)
public class SortInPlace {

   public static int[] sort (int[] a)
   {
      //Divisions
      int third = a.length / 3;
      int remainder = a.length % 3;
      int cause = 0;
      int max = 0;

      //Equal division
      {
         for (int i = 0; i < third; i++)
         {
            a[i] = 0;
            a[third + i] = 1;
            a[(third * 2) + i] = 2;
         }
      }
      System.out.println(Arrays.stream(a).boxed().toList());
      System.out.println("Max: " + cause + " with value of " + max);
      return a;
   }
   
   public static void main (String args[])
   {
      int[] arr = {0, 2, 1, 0, 1, 2, 2, 0, 1};
      sort(arr);
   }
}