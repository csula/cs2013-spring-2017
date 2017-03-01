package edu.calstatela.cs.jtran.lab9;

public class App {

	public static void main(String[] args) {
		MySet<Card> deck = new MySet<Card>();
		
		deck.Insert( new Card("Ace", "Spades") );
		deck.Insert( new Card("King", "Diamonds") );
		deck.Insert( new Card("Ace", "Spades") );
		deck.Insert( new Card("5", "Hearts") );
		
		for (Card card : deck.getAll() ) {
			System.out.println( card );
		}
	}

}
