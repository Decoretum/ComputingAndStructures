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
        //Initialize the structures used 
        //Tracker for what are the vertices visited and not visited (shortest path tree)
        //Tracker for distances of the vertices

        int[] distances = new int[matrix.length];
        boolean[] shortestPT = new boolean[matrix.length];

        //Let's pick a random source node
        Random randomGen = new Random();
        int sourceVertex = randomGen.nextInt(matrix.length + 1);

        for (int i = 0; i < distances.length; i++)
        {
            if (i == sourceVertex)
            {
                distances[i] = 0;
            }
        }

        //We now begin with figuring out the shortest path tree from source vertex to all other vertices
        for (int mainVertex = 0; mainVertex <= matrix.length - 1; mainVertex++)
        {
            for (int adjacentVertex = 0; adjacentVertex <= matrix[mainVertex].length - 1; adjacentVertex++)
            {
                int weight = matrix[mainVertex][adjacentVertex];
                
            }
        }



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

    public static void dijkstras(int[][] graph, int source)
    {
        //Initialize array for holding distances
        //Initialize array for determining if vertex is included in shortest path tree (or source to vertex is finalized)
        int[] distances = new int[graph.length];
        boolean[] sptSet = new boolean[graph.length];

        for (int i = 0; i <= graph.length - 1; i++)
        {
            distances[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }

        //Since source node is the first vertex, initialize its distance to 0
        distances[source] = 0;

        while (Arrays.toString(sptSet).contains("false"))
        {
            //We find vertex with the minimum distance and hasn't been explored yet
            int minVertex = minDistanceVertex(distances, sptSet);
            
            //Mark this vertex as visisted
            sptSet[minVertex] = true;
            
            //Iterate over adjacent vertices and update if needed
            for (int j = 0; j <= graph[minVertex].length -1; j++)
            {
                int weight = graph[minVertex][j];
                int adjacentVertexDistance = distances[j];
                int currVertexDistance = distances[minVertex];
                int sum = weight + currVertexDistance;  
                boolean notDiscovered = sptSet[j] == false;

                if (sum < adjacentVertexDistance && notDiscovered == true && weight != 0)
                {
                    distances[j] = sum;
                }               
            }
        }

        System.out.println("Distances of vertexes from source Node");
        System.out.println(Arrays.toString(distances));

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


        dijkstras(graph, 0);
    }
}
