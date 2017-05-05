package edu.calstatela.cs.jtran.lab15;

import java.util.ArrayList;

public class Vertex implements Comparable<Vertex> {
	final int id;
	final ArrayList<Edge> edges = new ArrayList<Edge>();
	
	public Vertex(final int id) {
		this.id = id;
	}
	
	public void addEdge(Edge edge) {
		edges.add(edge);
	}

	public int compareTo(Vertex o) {
		if (this.id == o.id) {
			return 0;
		} else {
			return 1;
		}
	}
}
