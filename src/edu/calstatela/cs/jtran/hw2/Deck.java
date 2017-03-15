package edu.calstatela.cs.jtran.hw2;

import java.util.ArrayList;
import java.util.Collections;

public class Deck<E extends Comparable<E>> {

	public void addCard(E card) {
		dataCollection.add(card);
	}
	
	public void shuffle() {
		Collections.shuffle(dataCollection);
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
	
	public ArrayList<E> getCards() {
		return dataCollection;
	}
	
	private ArrayList<E> dataCollection = new ArrayList<E>();

	public Card removeRear() {
		// TODO Auto-generated method stub
		return null;
	}

	public void insertFront(Card card) {
		// TODO Auto-generated method stub
		
	}
}
