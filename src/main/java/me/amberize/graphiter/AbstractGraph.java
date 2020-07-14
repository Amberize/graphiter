package me.amberize.graphiter;

import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public abstract class AbstractGraph<E extends Edge> {

  protected Set<Vertex> vertices = new HashSet<>();
  protected Set<E> edges = new HashSet<>();

  private final List<Vertex> visited = new ArrayList<>();

  public void addVertex(Vertex vertex) {
    vertices.add(vertex);
  }

  public abstract void addEdge(Vertex first, Vertex second);

  public List<Vertex> getPath(Vertex start, Vertex end) {
    if (start == end) {
      return new ArrayList<>(singletonList(start));
    }

    visited.add(start);

    List<Edge> startEdges = start.getEdges();

    List<Vertex> adjacentVertices = startEdges.stream()
        .map(edge -> edge.getOtherSide(start))
        .collect(toList());

    if (adjacentVertices.isEmpty() || visited.containsAll(adjacentVertices)) {
      return emptyList();
    }

    List<Vertex> nonVisitedAdjacentVertices = adjacentVertices.stream()
        .filter(vertex -> !visited.contains(vertex))
        .collect(toList());

    Optional<List<Vertex>> found = nonVisitedAdjacentVertices.stream()
        .map(vertex -> getPath(vertex, end))
        .filter(result -> !result.isEmpty())
        .findFirst();

    found.ifPresent(vertexList -> vertexList.add(0, start));

    return found.orElse(emptyList());
  }

}
