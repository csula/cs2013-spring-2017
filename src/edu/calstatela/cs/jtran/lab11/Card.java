package edu.calstatela.cs.jtran.lab11;

import java.util.Comparator;

class CardComparator implements Comparator<Card> {
	public int compare(Card p1, Card p2) {
		return p1.compareTo(p2);
	}
}

class CardTable {
	public static final String[] SUITS = 
		{ 
			"D", "H", "C", "S" 
		};
	
	public static final String[] RANKS = 
		{ 
			"K", "Q", "J", 
			"10", "9", "8", 
			"7", "6", "5", 
			"4", "3", "2", 
			"A" 
		};
	
	public final static int undefined = -1;
}

public class Card implements Comparable<Card> {
	private final int suit;
	private final int rank;
	
	static int rankToIndex(String rank) {
		for (int i = 0; i < 13; i++) {
			if (rank == CardTable.RANKS[i]) {
				return i;
			}
		}
		
		return CardTable.undefined;
	}
	
	static int suitToIndex(String suit) {
		for (int i = 0; i < 4; i++) {
			if (suit == CardTable.SUITS[i]) {
				return i;
			}
		}
		
		return CardTable.undefined;
	}

	Card(final int index) {
		assert(index >= 0 && index < 52);
		
		rank = index % 13;
		suit = index / 13;
	}
	
	Card(final String rank, final String suit) {
		this.rank = rankToIndex(rank);
		this.suit = suitToIndex(suit);
	}
	
	private int getRankNumber() {
		return rank;
	}
	
	private int getSuitNumber() {
		return suit;
	}
	
	public String Rank() {
		return CardTable.RANKS[rank];
	}
	
	public String Suit() {
		return CardTable.SUITS[suit];
	}
	
	public int compareTo(Card other) {
		int myRank = getRankNumber();
		int hisRank = other.getRankNumber();
		int mySuit = getSuitNumber();
		int hisSuit = other.getSuitNumber();
		
		if (myRank == hisRank) {
		  if (mySuit == hisSuit) {
			  return 0;
		  } else {
			  if (mySuit > hisSuit) {
				  return 1;
			  } else {
				  return -1;
			  }
		  }
		} else {
			if (myRank > hisRank ) {
				return 1;
			} else {
				return -1;
			}
		}
	}

	public boolean equals(Card other) {
		return compareTo(other) == 0;
	}
	
	public String toString() {
		return "[" + Rank() + Suit() + "]";
	}
}
