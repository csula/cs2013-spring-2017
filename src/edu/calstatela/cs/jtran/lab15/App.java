package edu.calstatela.cs.jtran.lab15;

import java.io.File;

public class App {
	public static void main(String[] args) {
		try {
			Graph g = new Graph(new File("graph.txt"));
			System.out.println( g.getDistance( 5, 4) );
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
