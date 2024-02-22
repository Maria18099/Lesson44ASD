package org.example;


public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.connect(0,1);
        graph.connect(0,2);
        graph.connect(1,2);
        graph.connect(2,0);
        graph.connect(2,3);
        graph.connect(3,3);
        graph.BFS(0);
    }
}