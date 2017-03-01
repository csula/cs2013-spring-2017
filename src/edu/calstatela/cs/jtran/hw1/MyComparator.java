package edu.calstatela.cs.jtran.hw1;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

	public int compare(Integer p2, Integer p1) {
		if (p2 == p1) {
			return 0;
		} else if (p2 < p1) {
			return -1;
		} else {
			return 1;
		}
	}
}
