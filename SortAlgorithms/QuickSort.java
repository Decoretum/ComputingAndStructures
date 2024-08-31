package SortAlgorithms;
import java.util.Arrays;


public class QuickSort { //https://www.geeksforgeeks.org/quick-sort-algorithm/, https://www.youtube.com/watch?v=COk73cpQbFQ

public static void quickSort(int[] a, int start, int end)
{
   if (start < end) //Basically, if there are still elements after pivot
   {
      int pIndex = partition(a, start, end);
      quickSort(a, start, pIndex - 1); //partition elements less than pIndex
      quickSort(a, pIndex + 1, end); //parition elements greater than pIndex
   }
}

public static int partition(int[] a, int start, int end)
{
   //We assume pivot is right-most element
   //Partition index is assumed to be at the start
   int pivot = a[end];
   int pIndex = start;

   //We swap elements of array that are lesser than the pivot with the element at the pivot index 
   for (int i = start; i < end; i++)
   {
      if (a[i] <= pivot)
      {
         int curr = a[i];
         a[i] = a[pIndex];
         a[pIndex] = curr;
         pIndex = pIndex + 1;
      }
   }

   //Swap element at partition index with the right-most element or pivot
   a[end] = a[pIndex];
   a[pIndex] = pivot;
   return pIndex;
}

public static void main(String args[])
{
   int t[] = {7, 2, 1, 6, 8, 5, 3, 4, 1};
   quickSort(t, 0, t.length - 1);
   System.out.println(Arrays.stream(t).boxed().toList());
}
   
}