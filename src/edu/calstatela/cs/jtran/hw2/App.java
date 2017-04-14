package edu.calstatela.cs.jtran.hw2;

public class App {
	
	public void runTest(int count) {
		for (int kk = 0; kk < count; kk++) {
			for (int ii = 0; ii < count; ii++ ) {
				Deck<Card> deck = new Deck<Card>();
				
				// add 52 cards to the deck
				for (int i = 0; i < 52; i++) {
					deck.addCard( new Card(i) );
				}
		
				for (int j = 0; j < 20; j++) {
					deck.shuffle();
				}
				
				// print all cards in the deck
				for (Card c : deck.getCards() ) {
					// System.out.println(c);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		new App().runTest(200);
		long stop = System.currentTimeMillis();
		long total = stop - start;
		System.out.println("time: " + total);
	}
	
}
