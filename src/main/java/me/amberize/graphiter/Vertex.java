package me.amberize.graphiter;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
public class Vertex {

  private final Object value;

  @EqualsAndHashCode.Exclude
  @ToString.Exclude
  private List<Edge> edges = new ArrayList<>();

  public <T> T getValue() {
    return (T) value;
  }

  public void addEdge(Edge edge) {
    edges.add(edge);
  }
}
