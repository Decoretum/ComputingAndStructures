package SearchAlgorithms;

public class BinarySearch { //https://www.scholarhat.com/tutorial/datastructures/binary-search-in-data-structures
    
    public static int recursive (int [] a, int n)
    {
        int low = 0;
        int high = a.length - 1;
        int mid = 0;

        while (true)
        {
            mid = (low + high) / 2;

            if (a[mid] > n)
            {
                high = mid - 1;
            }
            else if (a[mid] < n)
            {
                low = mid + 1;            }
            else break;
        }
        return mid;
    }

    public static void main (String args [])
    {
        int [] t = {1, 2, 3, 4, 5, 10, 12, 20};
        System.out.println(recursive(t, 20));
    } 
}
