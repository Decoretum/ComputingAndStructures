package GreedyAlgorithms;
import java.util.*;

public class Djikstra {
    
    //Using Adjacency Matrix
    

    //Shortest Path Tree (SPT)
    //Assuming wer are dealing with undirected graph
    //https://brilliant.org/wiki/dijkstras-short-path-finder/
    public static void spt(int[][] matrix)
    {
        //Initialize the structures used 
        //Tracker for what are the vertices visited and not visited (shortest path tree)
        //Tracker for distances of the vertices

        //The Source vertex we start on dictates the succeeding distances of the adjacent vertex 
        //to the chosen Source vertex
        
        //Not all vertex have the same minimum distance from one to another

        int[] distances = new int[matrix.length];
        boolean[] shortestPT = new boolean[matrix.length];

        //Let's pick a random source node
        Random randomGen = new Random();
        int sourceVertex = randomGen.nextInt(matrix.length);
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
            shortestPT[mainVertex] = true;
            int currentVertexDistance = distances[mainVertex];

            //sum = (weight between current vertex and adjacent vertex) + (distance of current vertex from source vertex)
            for (int adjacentVertex = 0; adjacentVertex <= matrix[mainVertex].length - 1; adjacentVertex++)
            {
                int weight = matrix[mainVertex][adjacentVertex];
                int adjacentVertexDistance = distances[adjacentVertex];
                int sum = weight + currentVertexDistance;

                if (sum < adjacentVertexDistance && weight != 0)
                {
                  distances[adjacentVertex] = sum;
                } 
            }
        }

        System.out.println("Shortest path set from Source vertex " + sourceVertex);
        System.out.println(Arrays.toString(distances));

    }

    //Demo version
    //Coded and Debugged as I Visualized the Graph
    //Did not refer to old code
    public static void dijkstra(int[][] graph)
    {
        //Randomize Source Vertex
        Random randomizer = new Random();
        int sourceVertex = randomizer.nextInt(graph.length);

        //Initialize visited tracker and distances tracker
        int [] distances = new int[graph.length];
        boolean [] visited = new boolean[graph.length];
        for (int i = 0; i <= graph.length - 1; i++)
        {
            distances[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }

        //Since we are starting with the source vertex, we are at this position 
        //so distance is 0 to itself
        distances[sourceVertex] = 0;

        //Proceed with the actual algorithm
        while(Arrays.toString(visited).contains("false"))
        {
            int currentVertex = minDistanceVertex(distances, visited);
            int currentVertexDistance = distances[currentVertex];
            visited[currentVertex] = true;

            for (int adjacentVertex = 0; adjacentVertex <= graph[currentVertex].length - 1; adjacentVertex++)
            {
                int weight = graph[currentVertex][adjacentVertex];
                
                //There is a connection between current vertex and adjacent vertex
                if (weight != 0)
                {
                    int discoveredAdjacentVertexDistance = currentVertexDistance + weight;
                    int currentAdjacentVertexDistance = distances[adjacentVertex];
                    if (discoveredAdjacentVertexDistance < currentAdjacentVertexDistance)
                    {
                        distances[adjacentVertex] = discoveredAdjacentVertexDistance;
                    }
                }
            }
        }

        System.out.println("Shortest Distances from Vertex " + sourceVertex);
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

            //For the second condition, we could do (distance < Integer.MAX_VALUE)
            //But why? The current condition is just more efficient
            //Finding minimum value isn't really necessary, as long as we find the vertex that 
            //isn't visited yet
            if (vertexVisited == false && distance < min)
            {
                min = distance;
                vertex = i;
                break;
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

        dijkstra(graph);
    }
}
