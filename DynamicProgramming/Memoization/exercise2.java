package DynamicProgramming.Memoization;

// 1D Memoization
public class exercise2 {
   static int[] map = new int[Integer.MAX_VALUE / 7];
   
   //This is with memoization / Top-down approach of dynamic programming
   //Same concept as with file: exercise.java
   public static int fibo(int n)
   {
      if (n == 1)
      {
         return 1;
      } else if(n <= 0) {
         return 0;
      }

      if (map[n] != 0)
         return map[n];

      return map[n] = fibo(n - 1) + fibo(n - 2);
   }

   public static void main (String args[])
   {
      System.out.println(fibo(6));
   }

   /* 

   Complexity Analysis without memoization: 

   Time Complexity: O(2^n)

   Here, for every n, we are required to make a recursive call to fib(n – 1) and fib(n – 2). 
   For fib(n – 1), we will again make the recursive call to fib(n – 2) and fib(n – 3). 
   Similarly, for fib(n – 2), recursive calls are made on fib(n – 3) and fib(n – 4) until we reach the base case.
   
   If we draw the recursion tree of the Fibonacci recursion then we 
   found the maximum height of the tree will be n and hence the space complexity of the Fibonacci recursion will be O(n)

   Now in this process of memoization, considering the above Fibonacci numbers example, 
   it can be observed that the total number of unique calls will be at most (n + 1) only.


   Complexity Analysis with memoization:

   Time complexity: O(n)
   Auxiliary Space: O(n)
   */

}