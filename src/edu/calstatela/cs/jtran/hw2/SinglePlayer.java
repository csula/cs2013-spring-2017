package edu.calstatela.cs.jtran.hw2;

public class SinglePlayer {
	
	public void playGame(int N, int K, int M) {
		// set up (build super deck and initial hand)
		Deck<Card> superDeck = new Deck<Card>();
		
		// add N decks top superDeck
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 52; j++) {
				superDeck.addCard( new Card(j) );
			}
		}
		
		superDeck.shuffle();
		
		UniqueHand uniqueHand = new UniqueHand();
		while(uniqueHand.count() < 5) {
			Card card = superDeck.removeRear();
			if (uniqueHand.has(card)) {
				superDeck.insertFront( card );
			} else {
				uniqueHand.addCard( card );
			}
		}
		
		superDeck.shuffle();
		
		// game play
		boolean done = false;
		UniqueHand repeats = new UniqueHand();
		
		while (!done) {
			
			// print stuff
			System.out.println(uniqueHand);
			System.out.println(repeats);
		}
		
		// tear down (print score)
		int score = uniqueHand.calculateScore();
	}
	
	public static void main(String[] args) {
		int n = 5;
		int k = 5;
		int m = 20;
		new SinglePlayer().playGame(n, k, m);
	}
	
}
