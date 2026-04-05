package Graphs;

import java.util.*;

public class Adjancy {
    public static void main(String[] args) {
        int n = 5; // number of nodes

        List<List<Integer>> graph = new ArrayList<>();

        // initialize
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // add edges (undirected)
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 2, 4);

        // print graph
        for (int i = 0; i < graph.size(); i++) {
            System.out.println(i + " -> " + graph.get(i));
        }
    }

    static void addEdge(List<List<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u); // remove this line for directed graph
    }
}
