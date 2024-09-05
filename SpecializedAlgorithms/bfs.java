package SpecializedAlgorithms;
import java.util.*;

//https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/

public class bfs {

    public static void BFS_Matrix(LinkedList<Integer>[] graph, int source)
    {
        Queue<Object> q = new LinkedList<>();
        boolean[] visited = new boolean[graph.length];
        q.add(source);

        for (int i = 0; i <= visited.length - 1; i++)
        {
            visited[i] = false;
        }

        while (!q.isEmpty())
        {
            int popped = (int) q.poll();
            System.out.println("Vertex: " + popped);
            visited[popped] = true;

            //Add neighbors to queue
            for (int i = 0; i <= graph[popped].size() - 1; i++)
            {
                int connectedVertex = graph[popped].get(i);
                if (!q.contains(connectedVertex) && visited[connectedVertex] == false)
                {
                    System.out.println("Vertex " + popped + "\'s neighbor: " + connectedVertex);
                    q.add(connectedVertex);
                }
                
            }
        }

    }

    public static void main (String args[])
    {

        LinkedList<Integer>[] graph = Structures.Graph.graph.makeAdjacencyList(6);
        System.out.println("");

        // 0 - 1, 0 - 2, 1 - 3, 1 - 4, 2 - 1
        Structures.Graph.graph.addAdjacencyListConnection(graph, 0, 1, 20);
        Structures.Graph.graph.addAdjacencyListConnection(graph, 1, 3, 19);
        Structures.Graph.graph.addAdjacencyListConnection(graph, 1, 4, 2);
        Structures.Graph.graph.addAdjacencyListConnection(graph, 2, 1, 9);
        Structures.Graph.graph.addAdjacencyListConnection(graph, 2, 0, 10);

        Structures.Graph.graph.displayGraph(null, graph);
        BFS_Matrix(graph, 0);
    }
}