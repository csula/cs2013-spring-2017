package edu.calstatela.cs.jtran.hw4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

class comparator implements Comparator<TreeSet<Vertex>> {
	public int compare(TreeSet<Vertex> o1, TreeSet<Vertex> o2) {
		if (o1.equals(o2)) {
			return 0;
		} else {
			return 1;
		}
	}
}

public class Graph {
	final TreeMap<Integer, Vertex> g = new TreeMap<Integer,Vertex>();
	final TreeMap<TreeSet<Vertex>, Edge> ef = new TreeMap<TreeSet<Vertex>, Edge>(new comparator());

	Vertex getVertex(final int id) {
		return g.get(id);
	}
	
	double getDistance(final int id1, final int id2) {
		final Vertex v1 = g.get(id1);
		final Vertex v2 = g.get(id2);
		
		assert(v1 != null && v2 != null);
		
		final TreeSet<Vertex> pair = new TreeSet<Vertex>();
		pair.add(v1);
		pair.add(v2);
		
		final Edge e = ef.get(pair);
		assert(e != null);
		
		return e.weight;
	}
	
	private void ReadEdges(final File file) throws FileNotFoundException {
		final Scanner scanner = new Scanner(file);
		
		while(scanner.hasNext()) {
			final String line = scanner.nextLine();
			final String[] words = line.split("\\s+");
			if (words[0].equals("E")) {
				final int id1 = Integer.parseInt(words[1]);
				final int id2 = Integer.parseInt(words[2]);
				final double w = Double.parseDouble(words[3]);
				final Vertex v1 = g.get(id1);
				final Vertex v2 = g.get(id2);
			
				assert(v1 != null && v2 != null);
				
				final Edge e = new Edge(v1, v2, w);
				v1.addEdge(e);
				v2.addEdge(e);
			
				final TreeSet<Vertex> pair = new TreeSet<Vertex>();
				pair.add(v1); 
				pair.add(v2);
				ef.put(pair, e);
			}
		}
		
		scanner.close();
	}
	
	private void ReadVertices(final File file) throws FileNotFoundException {
		final Scanner scanner = new Scanner(file);
		
		while(scanner.hasNext()) {
			final String line = scanner.nextLine();
			final String[] words = line.split("\\s+");
			if (words[0].equals("V")) {
				final int id = Integer.parseInt(words[1]);
				final double x = Double.parseDouble(words[2]);
				final double y = Double.parseDouble(words[3]);
				final Vertex v = new Vertex(id, x, y);
				g.put(id, v);
			}
		}
		
		scanner.close();
	}

	Graph(final File file) throws FileNotFoundException {
		ReadVertices(file);
		ReadEdges(file);
	}
}

