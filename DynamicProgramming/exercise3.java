package DynamicProgramming;

public class exercise3 {

   //We use tabulation for dynamic programming
   //To get to the main solution, we first solve the smaller subproblems' solutions
   //Smaller subproblems' solutions will be used to eventually get to the solution for main problem
   //We store solutions in a table or storage which will be mainly used to solve the subsequent subproblems
   public static int tabulationFibo(int n)
   {
      int[] sequence = new int[n + 1]; // +1 is to deal with the 0th array element of sequence, which is 0

      //Independent variables
      //This is to set fibo(2) or sequence[2] = 0 + 1 = 1
      sequence[0] = 0;
      sequence[1] = 1;

      //iterations represent the subsequent subproblems to be solved to reach main problem
      for (int i = 2; i <= n; i++)
      {
         sequence[i] = sequence[i - 2] + sequence[i - 1];
      }

      return sequence[n];
   }

   public static void main (String args[])
   {
      System.out.println(tabulationFibo(4));
   }

   /* 
   Complexity analysis: 

   Time complexity: O(n)
   Auxiliary Space: O(n)
   */
}