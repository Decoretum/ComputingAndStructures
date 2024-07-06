package SortAlgorithms;
import java.lang.Math;
import java.util.Arrays;


public class MergeSort { //https://www.w3schools.com/dsa/dsa_algo_mergesort.php, https://www.geeksforgeeks.org/merge-sort/

    public static int[] merge(int[] a, int[] b)
    {
      int[] c = new int[a.length + b.length];
      
      //2 Pointers
      int i = 0;
      int j = 0;

      //New Array Pointer
      int p = 0;
        
      while(i <= a.length - 1 && j <= b.length - 1)
        {
            int left = a[i];
            int right = b[j];

            if (left < right)
            {
               c[p] = left;
               i++;
               p++;
            } else {
               c[p] = right;
               j++;
               p++;
            }
        }

        // If a sub array's pointer didn't finish iterating, then it means that it's remaining elements are greater than the 
        // other sub-array's elements

         while (i <= a.length - 1)
         {
            c[p] = a[i];
            i++;
            p++;
         } 
         
         while (j <= b.length - 1)
         {
            c[p] = b[j];
            p++;
            j++;
         }

         return c;
    }

    public static int[] mergeSort(int[] a, int layer)
    {
        /* System.out.println("Current layer " + layer); */

        //Base Condition for returning once array length is 1
        if(a.length == 1)
        {
            /* System.out.println("Array is " + Arrays.stream(a).boxed().toList() + " with the layer of " + layer); */
            return a;
        }

        //Split array into equal halves
        int half = (int) Math.floor(a.length / 2); 
        int remainder = a.length % 2;

        //Initialize two empty arrays
        int[] a1 = new int[half];
        int[] a2 = new int[half + remainder];

        //First sub-array
        for (int i = 0; i <= half - 1; i++)
        {
            a1[i] = a[i];
        }

        //Second sub-array
        for (int j = half, i = 0; j <= a.length - 1; j++, i++)
        {
            a2[i] = a[j];
        }

        //Keep Dividing them until array length is 1
        int[] sortedA1 = mergeSort(a1, layer + 1); 
        int[] sortedA2 = mergeSort(a2, layer + 1);

        /* 
        System.out.println("Returning in this recursive call is " + Arrays.stream(a).boxed().toList());
        System.out.println("Left array is " + Arrays.stream(a1).boxed().toList());
        System.out.println("Right array is " + Arrays.stream(a2).boxed().toList());
        System.out.println(""); 
        */

        //Returning a "merged" version of the arrays to the previous layer of recursion
        int [] sorted = merge(sortedA1, sortedA2);
        if (layer == 0)
         {
            System.out.println("Final sorted Array is " + Arrays.stream(sorted).boxed().toList());
         }
        return sorted;
    }



    public static void main (String args[])
    {
        int[] t = {5, 2, 1, 3};
        mergeSort(t, 0);
    }


   // Time Complexity:

   // Best Case: O(n log n), When the array is already sorted or nearly sorted.
   // Average Case: O(n log n), When the array is randomly ordered.
   // Worst Case: O(n log n), When the array is sorted in reverse order.

   // Space Complexity: O(n), Additional space is required for the temporary array used during merging

   
}