package me.amberize.graphiter;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class GraphTest {

  @Test
  public void shouldGetPathInUndirectedGraph() {
    UndirectedGraph graph = new UndirectedGraph();

    Vertex vertex1 = new Vertex("V1");
    graph.addVertex(vertex1);

    Vertex vertex2 = new Vertex("V2");
    graph.addVertex(vertex2);

    Vertex vertex3 = new Vertex("V3");
    graph.addVertex(vertex3);

    Vertex vertex4 = new Vertex("V4");
    graph.addVertex(vertex4);

    Vertex vertex5 = new Vertex("V5");
    graph.addVertex(vertex5);

    Vertex vertex6 = new Vertex("V6");
    graph.addVertex(vertex6);

    Vertex vertex7 = new Vertex("V7");
    graph.addVertex(vertex7);

    Vertex vertex8 = new Vertex("V8");
    graph.addVertex(vertex8);

    Vertex vertex9 = new Vertex("V9");
    graph.addVertex(vertex9);

    Vertex vertex10 = new Vertex("V10");
    graph.addVertex(vertex10);

    Vertex vertex11 = new Vertex("V11");
    graph.addVertex(vertex11);

    Vertex vertex12 = new Vertex("V12");
    graph.addVertex(vertex12);

    Vertex vertex13 = new Vertex("V13");
    graph.addVertex(vertex13);

    Vertex vertex14 = new Vertex("V14");
    graph.addVertex(vertex14);

    graph.addEdge(vertex1, vertex2);
    graph.addEdge(vertex1, vertex3);
    graph.addEdge(vertex1, vertex4);
    graph.addEdge(vertex1, vertex5);

    graph.addEdge(vertex2, vertex8);
    graph.addEdge(vertex2, vertex9);

    graph.addEdge(vertex3, vertex7);

    graph.addEdge(vertex4, vertex10);
    graph.addEdge(vertex4, vertex11);
    graph.addEdge(vertex4, vertex12);

    graph.addEdge(vertex5, vertex6);

    graph.addEdge(vertex11, vertex13);
    graph.addEdge(vertex11, vertex14);

    List<Vertex> expected = Arrays.asList(vertex8, vertex2, vertex1, vertex4, vertex11, vertex13);

    assertEquals(expected, graph.getPath(vertex8, vertex13));
  }

  @Test
  public void shouldGetPathInDirectedGraph() {
    DirectedGraph graph = new DirectedGraph();

    Vertex vertex1 = new Vertex("V1");
    graph.addVertex(vertex1);

    Vertex vertex2 = new Vertex("V2");
    graph.addVertex(vertex2);

    Vertex vertex3 = new Vertex("V3");
    graph.addVertex(vertex3);

    Vertex vertex4 = new Vertex("V4");
    graph.addVertex(vertex4);

    Vertex vertex5 = new Vertex("V5");
    graph.addVertex(vertex5);

    Vertex vertex6 = new Vertex("V6");
    graph.addVertex(vertex6);

    Vertex vertex7 = new Vertex("V7");
    graph.addVertex(vertex7);

    Vertex vertex8 = new Vertex("V8");
    graph.addVertex(vertex8);

    Vertex vertex9 = new Vertex("V9");
    graph.addVertex(vertex9);

    Vertex vertex10 = new Vertex("V10");
    graph.addVertex(vertex10);

    Vertex vertex11 = new Vertex("V11");
    graph.addVertex(vertex11);

    Vertex vertex12 = new Vertex("V12");
    graph.addVertex(vertex12);

    Vertex vertex13 = new Vertex("V13");
    graph.addVertex(vertex13);

    Vertex vertex14 = new Vertex("V14");
    graph.addVertex(vertex14);

    graph.addEdge(vertex1, vertex3);
    graph.addEdge(vertex1, vertex4);
    graph.addEdge(vertex2, vertex1);
    graph.addEdge(vertex2, vertex9);
    graph.addEdge(vertex4, vertex11);
    graph.addEdge(vertex4, vertex12);
    graph.addEdge(vertex5, vertex1);
    graph.addEdge(vertex5, vertex6);
    graph.addEdge(vertex5, vertex6);
    graph.addEdge(vertex7, vertex3);
    graph.addEdge(vertex8, vertex2);
    graph.addEdge(vertex10, vertex4);
    graph.addEdge(vertex11, vertex13);
    graph.addEdge(vertex11, vertex14);

    List<Vertex> expected = Arrays.asList(vertex8, vertex2, vertex1, vertex4, vertex11, vertex14);

    assertEquals(expected, graph.getPath(vertex8, vertex14));
  }

}
