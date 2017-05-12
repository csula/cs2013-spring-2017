package edu.calstatela.cs.jtran.hw4;

import java.util.ArrayList;

public class Vertex implements Comparable<Vertex> {
	final int id;
	final double x;
	final double y;
	final ArrayList<Edge> edges = new ArrayList<Edge>();
	
	public Vertex(final int id, final double x, final double y) {
		this.id = id;
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return id + "@" + "(" + x + "," + y + ")";
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
