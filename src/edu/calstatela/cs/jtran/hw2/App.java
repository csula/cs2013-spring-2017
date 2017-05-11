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
					System.out.println(c);
				}
			}
		}
	}

	public void run(final int m, final int n, final int k) {

	}

	public static void main(String[] args) {
		final int n = 20;
		final int m = 5;
		final int k = 5;
		new App().run(m, n, k);
	}

}
