package me.amberize.graphiter;


public class UndirectedGraph extends AbstractGraph<Edge> {

  public void addEdge(Vertex first, Vertex second) {
    edges.add(new Edge(first, second));
  }

}
