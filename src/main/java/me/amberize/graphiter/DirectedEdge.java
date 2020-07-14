package me.amberize.graphiter;

public class DirectedEdge extends Edge {

  public DirectedEdge(Vertex first, Vertex second) {
    super(first, second);
  }

  @Override
  public Vertex getOtherSide(Vertex vertex) {
    return getSecond();
  }
}
