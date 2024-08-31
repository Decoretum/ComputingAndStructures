package GreedyAlgorithms;
// import Structures.Graph.Graph;
import java.util.*;

public class Djikstra {
    
    //Using Adjacency Matrix
    

    //Shortest Path Tree (SPT)
    //Assuming wer are dealing with undirected graph
    //https://brilliant.org/wiki/dijkstras-short-path-finder/
    public static void spt(int[][] matrix, int src)
    {
        //Initialize the structures used 
        //Tracker for what are the vertices visited and not visited (shortest path tree)
        //Tracker for distances of the vertices

        int[] distances = new int[matrix.length];
        boolean[] shortestPT = new boolean[matrix.length];

        //Let's pick a random source node
        Random randomGen = new Random();
        int sourceVertex = randomGen.nextInt(matrix.length + 1);
        // sourceVertex = 0;

        for (int i = 0; i < distances.length; i++)
        {
            if (i == sourceVertex)
            {
                distances[i] = 0;
            }
            else
            {
               distances[i] = Integer.MAX_VALUE;
            }
            shortestPT[i] = false;
        }

        //We now begin with figuring out the shortest path tree from source vertex to all other vertices
        while (Arrays.toString(shortestPT).contains("false")) //Main vertexs
        {
            int mainVertex = minDistanceVertex(distances, shortestPT);

            //sum = (weight between current vertex and adjacent vertex) + (distance of current vertex from source vertex)
            for (int adjacentVertex = 0; adjacentVertex <= matrix[mainVertex].length - 1; adjacentVertex++)
            {
                int weight = matrix[mainVertex][adjacentVertex];
                int currentVertexDistance = distances[mainVertex];
                int adjacentVertexDistance = distances[adjacentVertex];
                int sum = weight + currentVertexDistance;

                shortestPT[mainVertex] = true;

                if (sum < adjacentVertexDistance && weight != 0)
                {
                  distances[adjacentVertex] = sum;
                } 
            }
        }

        System.out.println("Shortest path set from Source vertex " + sourceVertex);
        System.out.println(Arrays.toString(distances));

    }

    public static int minDistanceVertex(int[] distances, boolean[] sptSet)
    {
        int min = Integer.MAX_VALUE;
        int vertex = 0;
        for (int i = 0; i <= distances.length - 1; i++)
        {
            boolean vertexVisited = sptSet[i];
            int distance = distances[i];   

            if (vertexVisited == false && distance < min)
            {
                min = distance;
                vertex = i;
            }
        }

        return vertex;
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
                        { 8, 11, 0, 0, 0, 0, 1, 0, 7 }, //For element 11, (11) + (4) < 8 == False
                        { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };


        spt(graph, 0);
    }
}
