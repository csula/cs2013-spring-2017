package edu.calstatela.cs.jtran.lab9;

public class Card implements Comparable<Card> {
	String suit;
	String rank;
	
	Card(final String suit, final String rank) {
		this.suit = suit;
		this.rank = rank;
	}

	public int compareTo(Card other) {
		if (suit.equals(other.suit) && rank.equals(other.rank) ) {
			return 0;
		} else {
			return 1;
		}
	}

	public String toString() {
		return rank + " of " + suit;
	}
}
