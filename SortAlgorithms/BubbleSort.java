package SortAlgorithms;

import java.util.Arrays;

public class BubbleSort { //https://www.geeksforgeeks.org/bubble-sort-algorithm/

    public static int [] bubble(int [] a)
    {   
        for (int i = a.length - 1; i > 0; i--)
        {
            boolean swapped = false;
            for (int j = 0; j <= i-1; j++)
            {
                int curr = a[j];
                int next = a[j + 1];
                if (curr > next)
                {
                    a[j + 1] = curr;
                    a[j] = next;
                    swapped = true;
                }
            }
            if (swapped == false) {System.out.println("No Sort Occurred"); break;}
            
        }
        System.out.println(Arrays.stream(a).boxed().toList());
        return a;
    }

    public static void main (String args[])
    {
        int[] t = {20, 11, 2, 0, 5, 6, 10, 9, 20, 19, 20, 43, 219, 2};
        int [] k = {1, 2, 3, 5};
        bubble((k));
    }
}

// Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping 
// the adjacent elements if they are in the wrong order. This algorithm is not suitable for 
// large data sets as its average and worst-case time complexity is quite high.
// In-place sorting since no major new data structure has to be initialized and used 

// Total no. of passes: n-1
// Total no. of comparisons: n*(n-1)/2

//Process Flow:
//1. This is an O(n^2) since we will be doing the iteration per nth element of the array
//2. We start sorting from the right by putting the highest value elements to the right
//2.a We start the scanning from the left by comparing current and next value, then swapping them if needed
// - This results to the highest value element to be sorted to the right, and then we sort the next highest values
//3. We have a boolean value to stop sorting if no swap occurred during the first iteration 