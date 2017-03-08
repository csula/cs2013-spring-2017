package edu.calstatela.cs.jtran.hw2;

import java.util.ArrayList;

public abstract class Hand {
	abstract ArrayList<Card> getCards();
	abstract void removeCard();
	abstract void removeCard(Card card);
	abstract void addCard(Card card);
}
