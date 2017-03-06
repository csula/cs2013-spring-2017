package edu.calstatela.cs.jtran.hw1;

import java.util.ArrayList;

public class Deck<E extends Comparable<E>> {
	public Deck() {
		// allocate cards
	}
	
	public void shuffle() {
		// implement shuffle function
	}
	
	public int[] search() {
		int a[] = { 0, 0 };
		return search(a, 1);
	}

	public int[] search(final int[] maxMin, final int position) {
		if (position == dataCollection.size() - 1) {
			return maxMin;
		} else {
			E current = dataCollection.get(position);
			E maxItem = dataCollection.get(maxMin[0]);
			E minItem = dataCollection.get(maxMin[1]);
			
			int newMax = maxMin[0];
			int newMin = maxMin[1];
			
			if (current.compareTo(maxItem) == 1) {
				newMax = position;
			}
			
			if (current.compareTo(minItem) == -1) {
				newMin = position;
			}
			
			final int[] a = { newMax, newMin };
			return search(a, position + 1);
		}
	}
	
	public void printPermutation(int count) {
		// implement/call a recursive permutation fn
	}
	
	private ArrayList<E> dataCollection = new ArrayList<E>();
}
