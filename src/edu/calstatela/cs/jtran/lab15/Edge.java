package edu.calstatela.cs.jtran.lab15;

public class Edge {
	final Vertex v1;
	final Vertex v2;
	final double weight;
	
	public Edge(Vertex v1, Vertex v2, final double w) {
		this.v1 = v1; 
		this.v2 = v2; 
		this.weight = w;
	}
}
