package edu.calstatela.cs.jtran.hw1;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

	public int compare(Integer p2, Integer p1) {
		
		// check to see if both are even or both are odd
		boolean notOddEven =
		p1 % 2 == 0 && p2 % 2 == 0 || p1 % 2 != 0 && p2 % 2 != 0;
		boolean multiples3 = 
		p1 % 3 == 0 && p2 % 3 == 0 || p1 % 3 != 0 && p2 % 3 != 0;
				
		if (notOddEven) {
			if (multiples3) {
				if (p1 > p2) {
					return 1;
				} else if (p2 > 1) {
					return -1;
				} else {
					return 0;
				}
			} else {
				if (p1 % 3 == 0) {
					return 1;
				} else {
					return -1;
				}
			}			
		} else {
			if (p2 == p1) {
				return 0;
			} else if (p2 < p1) {
				return -1;
			} else {
				return 1;
			}
		}
	}
}
