package edu.calstatela.cs.jtran.lab15;

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
	TreeMap<Integer, Vertex> g = 
		new TreeMap<Integer,Vertex>();
	TreeMap<TreeSet<Vertex>, Edge> ef = 
		new TreeMap<TreeSet<Vertex>, Edge>(new comparator());

	double getDistance(int id1, int id2) {
		Vertex v1 = g.get(id1);
		Vertex v2 = g.get(id2);
		assert(v1 != null && v2 != null);

		/*
		for (Edge e : v1.edges) {
			if (v1 == e.v1 && v2 == e.v2 ||
				v2 == e.v1 && v1 == e.v2) {
					return e.weight;
				}
		}
		
		return -1;
		*/
		
		TreeSet<Vertex> pair = new TreeSet<Vertex>();
		pair.add(v1);
		pair.add(v2);
		Edge e = ef.get(pair);
		assert(e != null);
		return e.weight;
	}
	
	Graph(File file) throws FileNotFoundException {
		Scanner scanner = new Scanner(file);
		
		while(scanner.hasNext()) {
			int id1 = scanner.nextInt(), id2 = scanner.nextInt();
			double w = scanner.nextDouble();
			System.out.println(id1 + " " + id2 + " " + w);
			Vertex v1 = g.get( id1 );
			Vertex v2 = g.get( id2 );
			
			if (v1 == null) {
				v1 = new Vertex( id1 );
				g.put(id1, v1);
			}
			if (v2 == null) {
				v2 = new Vertex( id2 );
				g.put(id2, v2);
			}
			Edge e = new Edge(v1, v2, w);
			v1.addEdge(e);
			v2.addEdge(e);
			
			TreeSet<Vertex> pair = new TreeSet<Vertex>();
			pair.add(v1); 
			pair.add(v2);
			ef.put(pair, e);
		}
		
		scanner.close();
	}
}

