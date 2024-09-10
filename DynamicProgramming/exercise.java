package DynamicProgramming;

public class exercise {

   //To get state(N) assuming that only elements 1, 3, and 5 are used
   public static int state(int N)
   {
      if (N < 0)
         return 0;

      else if (N == 0)
         return 1;

      return state(N - 1) + state(N - 3) + state(N - 5);
   }

   //Memoization - Storing the solution to a sub-problem so we can access this later
   //Sample of Dynamic Programming
   //We start with dealing with the main solution, then we recursively brain down this solution to smaller sub-problems
   //Value of sub-problems are stored in a storage to be used for subsequent recursive calls
   //Finally, we get the output by consolidating all the outputs from the smaller subproblems as we call the main solution
   static int[] memo = new int[Integer.MAX_VALUE / 7];

   public static int stateMemo(int N)
   {
      if (N < 0)
         return 0;
      else if (N == 0)
         return 1;

      if (memo[N] != 0)
         return memo[N];

      else
      {
         int newValue = stateMemo(N - 1) + stateMemo(N - 3) + stateMemo(N - 5);
         memo[N] = newValue;
         return newValue;
      }
         
   }

    public static void main (String args[])
    {
      System.out.println(stateMemo(3));
      //state(3) = state(2) + state(0) =  1 + 1
    }

   /*
   Time Complexity: O(3n), As at every stage we need to take three decisions and 
   the height of the tree will be of the order of n.

   Auxiliary Space: O(n), The extra space is used due to the recursion call stack.
   */
}