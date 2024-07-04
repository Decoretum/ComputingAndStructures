package SortAlgorithms;
import java.lang.Math;
import java.util.Arrays;



public class MergeSort { //https://www.geeksforgeeks.org/merge-sort/

   //Merging two arrays
   //one array can be >=< in length than the other
   public static int[] merge(int[] a1, int[] a2) 
   {
      //2 pointers
      int[] newArray = new int[a1.length + a2.length];
      int p = 0; //new Array pointer
      int i = 0;
      int j = 0;
      while (i <= a1.length - 1 && j <= a2.length - 1)
      {
         int left = a1[i];
         int right = a2[j];
         if (left < right)
         {
            newArray[p] = left;
            p++;
            i++;
         } else {
            newArray[p] = right;
            p++;
            j++;

         }
      }

      System.out.println("MERGED ARRAY SO FAR " + Arrays.stream(newArray).boxed().toList());
      System.out.println("AT THIS POINT, LEFT IS " + Arrays.stream(a1).boxed().toList() + " WHILE RIGHT IS " + Arrays.stream(a2).boxed().toList());
      System.out.println("i POINTER IS " + i + " AND J POINTER IS " + j);

      while (i <= a1.length - 1)
      {
         newArray[p] = a1[i];
         i++;
         p++;
      } while (j <= a2.length - 1)
      {
         newArray[p] = a2[j];
         j++;
         p++;
      }
      return newArray;
   }


   public static int[] mergeSort(int[] a)
   {
      if (a.length == 1)
      {
         return a;
      }

      //Split Array into equal halves
      int half = (int) Math.floor(a.length / 2);
      int remainder = a.length % 2;
      
      int[] a1 = new int[half];
      int[] a2 = new int[half + remainder];
      for (int i = 0; i <= (half - 1); i++)
      {
         a1[i] = a[i];
      }

      for (int i = 0, j = half; j <= (a.length  - 1); i++, j++)
      {
         a2[i] = a[j];
      }

      //This section will be done PER LAYER ABOVE after "a" is "returned"
      int[] sortedA1 = mergeSort(a1); //result if (a.length == 1)
      int[] sortedA2 = mergeSort(a2); //result if (a.length == 1)

      return merge(sortedA1, sortedA2);
   }

	public static void main (String args[])
	{
	  int[]a = {12, 8, 9, 3, 6, 5, 4};
	  int[]b = {2, 21, 2, 9, 10};
     int[] c = mergeSort(a);
     System.out.println(Arrays.stream(c).boxed().toList());
	}
}