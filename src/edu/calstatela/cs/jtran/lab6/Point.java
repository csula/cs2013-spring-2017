package edu.calstatela.cs.jtran.lab6;

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
