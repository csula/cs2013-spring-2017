package edu.calstatela.cs.jtran.hw1;

public class Card implements Comparable<Card> {
	String suit;
	String rank;
	
	Card(final int index) {
		// optional create a suit and rank from index
	}
	
	Card(final String rank, final String suit) {
		this.suit = suit;
		this.rank = rank;
	}
	
	public int compareTo(Card other) {
		// need to update according to priority in homework writeup
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
