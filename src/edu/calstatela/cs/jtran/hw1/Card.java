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
	
	private int getRankNumber() {
		if (rank == "King") {
			return 13;
		} else if (rank == "Queen") {
			return 12;
		} /* ... */ else {
			return 0;
		}
	}
	
	private int getSuitNumber() {
		if (suit == "diamonds") {
			return 4;
		} else if (suit == "hearts") {
			return 3;
		} /* ... */ {
			return 1;
		}
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

	public String toString() {
		return rank + " of " + suit;
	}
}
