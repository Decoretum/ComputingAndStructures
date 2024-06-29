package SortAlgorithms;

import java.sql.Time;
import java.util.Arrays;

public class InsertionSort {
    

    public static int[] sort (int[] a)
    {
        //Assume that the first element is already sorted since
        for (int i = 1; i <= a.length-1; i++)
        {
            for (int j = i; j >= 1; j--)
            {
                int curr = a[j];
                int back = a[j - 1];
                if (curr < back)
                {
                    a[j] = back;
                    a[j - 1] = curr;
                }
            }
        }

        System.out.println(Arrays.stream(a).boxed().toList());
        return a;
    }

    public static void main (String args[])
    {
        int[]t = {23, 1, 10, 5 ,2, 40, 100, 3};
        sort(t);
    }

    //Process Flow:
    //1. Start scanning from the 1th element since 0th element is assumed to be sorted
    //2. From the current position, compare and swap current and back element if needed
    //3. Do step 2 to the elements before the current position (swapping process will cascade)
    //4. Move the pointer to the next th element, and do step 2-3 again

    // Time Complexity of Insertion Sort
    // Best case: O(n) , If the list is already sorted, where n is the number of elements in the list.
    // Average case: O(n 2 ) , If the list is randomly ordered
    // Worst case: O(n 2 ) , If the list is in reverse order
    
    // Space Complexity of Insertion Sort
    // Auxiliary Space: O(1), Insertion sort requires O(1) additional space, making it a space-efficient sorting algorithm.

    //in-place and stable algorithm

    // Insertion sort is used when number of elements is small. 
    // It can also be useful when the input array is almost sorted, 
    // and only a few elements are misplaced in a complete big array.
}
