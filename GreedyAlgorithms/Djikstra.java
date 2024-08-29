package GreedyAlgorithms;
import Structures.Graph.*;
import java.util.*;

public class Djikstra {
    
    //Using Adjacency Matrix
    

    //Shortest Path Tree (SPT)
    //Assuming wer are dealing with undirected graph
    //https://brilliant.org/wiki/dijkstras-short-path-finder/
    public static void spt(int[][] matrix, int src)
    {
        // Assign a distance value to all vertices in the input graph. Initialize all distance values as INFINITE . 
        // Assign the distance value as 0 for the source vertex so that it is picked first.
        ArrayList<Object> distances = new ArrayList<>();
        for (int i = 0; i <= matrix.length - 1; i++)
        {
            if (i == 0)
            distances.add(0);
            
            else
            distances.add("INF");
        }

        // Create a set sptSet (shortest path tree set) that keeps track of vertices included in the shortest path tree
        int vertex = 0;
        boolean[] sptSet = new boolean[matrix.length];

        for (int i = 1; i < sptSet.length; i++)
        {
            sptSet[i] = false;
        }
        while (Arrays.asList(sptSet).contains(false))
        {
            // Pick a vertex "vertex" that is not there in sptSet and has a minimum distance value.
            // Include "vertex" to sptSet 
            if (vertex == 0)
            {
                sptSet[0] = true;
            } else {
                // #The rest of the vertices
            }

            // Then update the distance value of all adjacent vertices of "vertex"
            // Iterate through the adjacent vertices
            HashMap<Integer, Integer> vertexWeightMap = new HashMap<>(); 
            for (int i = 0; i < matrix.length; i++)
            {
                int weight = matrix[vertex][i];
                if (vertex == 0 && i == 0)
                {
                    continue;
                } else if (weight != 0) {
                    int vertexFound = i;
                    vertexWeightMap.put(vertexFound, weight);
                }
            }

            // For every adjacent vertex v, if the sum of the distance value of u (from source) and weight of edge u-v , 
            // is less than the distance value of v , then update the distance value of vm
            int currNodeDistance = (int) distances.get(vertex);
            for (int adjacentNodevertex : vertexWeightMap.keySet())
            {
                int adjacentNodeWeight = vertexWeightMap.get(adjacentNodevertex);
                int adjacentNodeDistance = 0; //TBC
                int sum = adjacentNodeWeight + currNodeDistance;

                // if(sum < )
            }

            int sum = 0;

            vertex += 1;
        }
    }


    public static void main (String args[])
    {
        int graph[][]
        = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                        { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                        { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                        { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                        { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                        { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                        { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                        { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                        { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };


        spt(graph, 0);
    }
}
