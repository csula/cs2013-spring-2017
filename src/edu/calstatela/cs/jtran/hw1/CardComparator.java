package edu.calstatela.cs.jtran.hw1;

import java.util.Comparator;

public class CardComparator implements Comparator<Card> {

	public int compare(Card p1, Card p2) {
		return p1.compareTo(p2);
	}
}
