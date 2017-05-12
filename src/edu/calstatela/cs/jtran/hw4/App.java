package edu.calstatela.cs.jtran.hw4;

import java.io.File;
import java.util.ArrayList;

public class App {
	
	public static void main(String[] args) {
		new App().run();
	}

	private void run() {
		try {
			Graph g = new Graph(new File("graph_v2.txt"));
			final Vertex start = g.getVertex(1);
			final Vertex goal   = g.getVertex(5);
			
			final ArrayList<Edge> paths = aStar(g, start, goal);
			
			System.out.println("start: " + start);

			if (paths == null) {
				System.out.println("no path found");
			} else {
				for (Edge path : paths) {
					System.out.println(path);
				}
			}
			System.out.println("end: " + goal);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private ArrayList<Edge> aStar(Graph g, final Vertex start, final Vertex goal) {

		return null;
	}
	
}
