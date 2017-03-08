package edu.calstatela.cs.jtran.hw2;

public class App {
	
	public void runTest() {
		Deck<Card> deck = new Deck<Card>();
		
		// add 52 cards to the deck
		for (int i = 0; i < 52; i++) {
			deck.addCard( new Card(i) );
		}

		deck.shuffle();
		
		// print all cards in the deck
		for (Card c : deck.getCards() ) {
			System.out.println(c);
		}
	}
	
	public static void main(String[] args) {
		new App().runTest();
	}
	
}
