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
		int a[] = { 0, 51 };
		// call another recursive search fn (override parameters)
		return a;
	}
	
	public void printPermutation(int count) {
		// implement/call a recursive permutation fn
	}
	
	private ArrayList<E> dataCollection = new ArrayList<E>();
}
