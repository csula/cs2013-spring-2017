package edu.calstatela.cs.jtran.hw4;

public class Edge {
	final Vertex v1;
	final Vertex v2;
	final double weight;
	
	public Edge(final Vertex v1, final Vertex v2, final double w) {
		this.v1 = v1; 
		this.v2 = v2; 
		this.weight = w;
	}
	
	public String toString() {
		if (v1.id <= v2.id) {
			return v1.id + " " + v2.id; 
		} else {
			return v2.id + " " + v1.id;
		}
	}
}
