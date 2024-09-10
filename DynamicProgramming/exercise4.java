package DynamicProgramming;

public class exercise4 {
   

   //Since we just use the previous 2 values, we don't need a structure to store these previous data
   //We can just use primitive data to recall last 2 values for fibonnaci sequence
   public static int tabulationFiboOpt(int n)
   {
      int minus2 = 0;
      int minus1 = 1;
      int curr = 0;

      //Start with 1 (1) 2 (3)
      for (int i=2; i <= n; i++)
      {
         curr = minus1 + minus2;
         minus2 = minus1;
         minus1 = curr;
      }

      return curr;
   }

   public static void main (String args[])
   {
      System.out.println(tabulationFiboOpt(6));
   }
}