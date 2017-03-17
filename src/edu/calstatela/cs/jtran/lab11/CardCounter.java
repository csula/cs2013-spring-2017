package edu.calstatela.cs.jtran.lab11;

import java.util.Map;
import java.util.TreeMap;

public class CardCounter {

	static final int MAX = 53;
	
	public static void main(String[] args) {
		// setup create empty deck
		Map<Card,Integer> notebook = new TreeMap<Card,Integer>();
		
		// loop
		for (int i = 0; i < MAX; i++) {
			int idx = (int)(Math.random() * 52);
			Card card = new Card(idx);
			
			if (notebook.containsKey(card)) {
				int count = notebook.get(card) + 1;
				notebook.put(card, count);
			} else {
				notebook.put(card, 1);
			}
		}
		
		// teardown display cards and count
		for (Card card : notebook.keySet() ) {
			int val = notebook.get(card);
			System.out.println(card + " " + val );
		}
	}
}
