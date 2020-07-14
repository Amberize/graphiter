package me.amberize.graphiter;

import lombok.Data;

@Data
public class Edge {

  private final Vertex first;

  private final Vertex second;

  public Edge(Vertex first, Vertex second) {
    if (first == null) {
      throw new IllegalStateException("First vertex could not be null");
    }

    if (second == null) {
      throw new IllegalStateException("Second vertex could not be null");
    }

    if (first.equals(second)) {
      throw new RuntimeException("Edge should be between two different vertices");
    }

    this.first = first;
    first.addEdge(this);

    this.second = second;
    second.addEdge(this);
  }

  public Vertex getOtherSide(Vertex vertex) {
    if (vertex.equals(first)) {
      return second;
    } else {
      return first;
    }
  }

}
