package Structures.Graph;

import java.util.*;


public class graph {
    
    //Adjacency Matrix
    public static int[][] makeAdjacencyMatrix(int a)
    {
        int[][] finalMatrix = new int[a][a];
        return finalMatrix;
    }

    //Adjacency List
    public static LinkedList<Integer>[] makeAdjacencyList(int a)
    {
        LinkedList<Integer>[] array = new LinkedList[a];
        for (int i = 0; i <= a - 1; i++)
        {
            LinkedList<Integer> ll = new LinkedList<Integer>();
            for (int j = 0; j <= a-1; j++)
            {
                if (j != i)
                ll.add(j);
            }
            array[i] = ll;
        }
        return array;
    }    


    //Adding an edge
    public static void addEdgeMatrix(int source, int destination, int[][] matrix, boolean isDirect)
    {   
        //Undirected Graph Edge
        if (isDirect == false)
        {
            matrix[source][destination] = 1;
            matrix[destination][source] = 1;
        } else {
            matrix[source][destination] = 1;
        }
    }

    public static void addEdgeList(int source, int destination, LinkedList<Integer>[] al, boolean isDirect)
    {
        //Undirected Graph Edge
        if (!isDirect)
        {
            for (int i = 0; i <= al.length - 1; i++)
            {
                LinkedList<Integer> ll = al[i];
                for (int j = 0; j <= al.length - 1; j++)
                {
                    if (j != i)
                    ll.add(j);
                }
            }
        }
    }

    public static void displayGraph(int[][] matrix, LinkedList<Integer>[] AdjList)
    {
        if (matrix != null)
        {
            for (int i[] : matrix)
            {
                System.out.println();
                for (int j : i)
                {
                    if (j == 0)
                    System.out.print(" 0 ");

                    else
                    System.out.print(" " + j + " ");
                }
            }
        } else {
            for (LinkedList<Integer> ll : AdjList)
            {
                System.out.println();
                if (ll.isEmpty())
                System.out.println("Empty Linked List for this Vertex");

                else {
                for (Integer i : ll)
                    {  
                        System.out.print(" " + (i) + " ");                   
                    }
                }
            }
        }
        
    }

    public static void main (String args[])
    {
        int[][] matrix = makeAdjacencyMatrix(5);
        LinkedList<Integer>[] al = makeAdjacencyList(5);
        addEdgeMatrix(2, 1, matrix, true);
        // displayGraph(matrix, null);
        addEdgeList(0, 0, al, false);
        displayGraph(null, al);
    }
}
