package SortAlgorithms;
import java.sql.Time;
import java.util.*;

public class SelectionSort{ //https://www.geeksforgeeks.org/selection-sort-algorithm-2/


    public static int [] sort(int a[])
    {
        //Traverse whole array
        //We don't traverse last element since this will be sorted once we sort 2nd to the last

        for (int i = 0; i <= a.length - 2; i++)
        {   
            //We divide array by (sorted, unsorted) by swapping minimum to the next position 
            //from the left till sorted
            int min = Integer.MAX_VALUE; //maximum positive integer value that can be represented in 32 bits in Java
            int posSwapped = 0;
            int curr = a[i];
            for (int j = i; j <= a.length-1; j++)
            {
                int subCurr = a[j];
                if (subCurr < min) 
                {
                    min = subCurr;
                    posSwapped = j;
                }
            }

            //We swap positions
            a[posSwapped] = curr;
            a[i] = min;
        }

        System.out.println(Arrays.stream(a).boxed().toList());
        return a;
    }
    public static void main (String args[])
    {
        int [] t = {20, 20, 3, 4, 1, 1, 10};
        sort(t);
    }

    //Process Flow:
    //1. 

    // Time Complexity: The time complexity of Selection Sort is O(N2) as there are two nested loops:

    // One loop to select an element of Array one by one = O(N)
    // Another loop to compare that element with every other Array element = O(N)
    // Therefore overall complexity = O(N) * O(N) = O(N*N) = O(N2)
    
    // Auxiliary Space: O(1) as the only extra memory used is for temporary variables while swapping two values in Array. The selection sort never makes more than O(N) swaps and can be useful when memory writing is costly. 
    
    // Selection sort has a time complexity of O(n^2) in the worst and average case.
    // Does not work well on large datasets.
    // Does not preserve the relative order of items with equal keys which means it is not stable.

    //In-place algorithm 
}