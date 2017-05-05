package edu.calstatela.cs.jtran.hw3;

public class App {
	
	void duplicate(Deck<Card> src, Deck<Card> dest) {
		// duplicate your cards here...
	}
	
	public long runTest(final int deckSize, final boolean validateFlag) {
		Deck<Card> d1 = new Deck<Card>();
		Deck<Card> d2 = new Deck<Card>();
		
		// fill decks
		for (int i = 0; i < deckSize; i++) {
			Card card = new Card((int)(Math.random() * 52));
			d1.addCard(card);
		}
		
		if (validateFlag) {
			duplicate(d1, d2);
			d2.Sort();
		}
		
		d1.shuffle();
		
		final long start = System.currentTimeMillis();
		d1.Sort();
		final long stop = System.currentTimeMillis();
		final long total = stop - start;

		if (validateFlag) {
			assert( d1.isEqual(d2) );
		}
		
		return total;
	}
	
	public static void main(String[] args) {
		App app = new App(); 
		{
			final boolean validate = true;
			final int deckSize = 200;
			final long time = app.runTest(200, validate);
			System.out.println("time: " + time);
		}
		{
			final boolean validate = false;
			for (int i = 1; i < 6; i++) {
				final int deckSize = (int) Math.pow(10, i);
				final long time = app.runTest(deckSize, validate);
				System.out.println(deckSize + " " + time);
			}
		}
	}
}
