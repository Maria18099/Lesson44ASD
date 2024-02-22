package org.example;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
    private int vertexAmount;
    private LinkedList<Integer> sumigniVershiny[];
    public Graph(int vertexAmount){
        sumigniVershiny = new LinkedList[vertexAmount];
        this.vertexAmount = vertexAmount;
        for (int i = 0; i < vertexAmount; i++) {
            sumigniVershiny[i] = new LinkedList<>();
        }
    }
    public void connect(int a, int b){
        sumigniVershiny[a].add(b);
    }
    void BFS(int s) {//start
        boolean visited[] = new boolean[vertexAmount];
        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[s]=true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.remove();
            System.out.print(s+" ");
            Iterator<Integer> i = sumigniVershiny[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

}
