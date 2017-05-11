package edu.calstatela.cs.jtran.lab06;

public class Point {
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	int x;
	int y;
}
