package SpecializedAlgorithms;
import java.util.*;

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
                if (!q.contains(graph[popped].get(i)) && visited[graph[popped].get(i)] == false)
                {
                    System.out.println("Vertex " + popped + "\'s neighbor: " + i);
                    q.add(graph[popped].get(i));
                }
                
            }
        }

    }

    public static void main (String args[])
    {

        LinkedList<Integer>[] graph = Structures.Graph.graph.makeAdjacencyList(6);
        Structures.Graph.graph.displayGraph(null, graph);
        System.out.println("");
        BFS_Matrix(graph, 0);
    }
}