package edu.calstatela.cs.jtran.lab15;

import java.util.ArrayList;

public class Vertex {
	final int id;
	ArrayList<Edge> edges = new ArrayList<Edge>();
	
	public Vertex(final int id) {
		this.id = id;
	}
	
	public void addEdge(Edge edge) {
		edges.add(edge);
	}
}
