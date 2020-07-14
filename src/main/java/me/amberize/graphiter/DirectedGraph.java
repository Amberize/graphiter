package me.amberize.graphiter;

public class DirectedGraph extends AbstractGraph<DirectedEdge> {

  @Override
  public void addEdge(Vertex first, Vertex second) {
    edges.add(new DirectedEdge(first, second));
  }

}
