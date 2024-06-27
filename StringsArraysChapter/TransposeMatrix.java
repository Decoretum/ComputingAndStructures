package StringsArraysChapter;
import java.util.*;

public class TransposeMatrix {
    
    public static int[][] transpose (int[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++)
        {
            System.out.print("[");
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.print("]");
            System.out.println("");
        }

        //Assuming that the grid's width and height are equal to one another
        //First and Last Elements are in-place
            //    x  x  x  x
            //    x  x  x  x
            //    x  x  x  x
            //    x  x  x  x
        for (int i = 0; i < matrix[0].length - 1; i++) //we are using mid points of matrix as references
        {
            for (int j = i + 1; j < matrix.length; j++) //2nd pointer for the horizontal and vertical lines
            {
                int tempTop = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tempTop;                
            }
        } 
        
        System.out.println("");

        for (int i = 0; i < matrix.length; i++)
        {
            System.out.print("[");
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.print("]");
            System.out.println("");
        }
        return matrix;
    }

    public static void main (String args [])
    {  
        // int[][] m = new int[][]{{1, 2, 3, 7}, {4, 2, 3, 9}, {8, 2, 5, 3}, {2, 5, 1, 0}};
        // int[][]m = new int[][]{{100,3},{500,7}};
        int[][]m =  new int[][]{{100,3,-1},{30,500,7},{123,456,789}};
        transpose(m);
    }
}
