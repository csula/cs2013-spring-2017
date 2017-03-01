package edu.calstatela.cs.jtran.hw1;

public class App {
	public static void Main(String[] args) throws Exception {
		Deck<Card> deck = new Deck<Card>();
		deck.shuffle();
		
		final int a[] = deck.search();
		final int max = a[0];
		final int min = a[1];
		
		// problem 1
		System.out.println("max card is at location " + max);
		System.out.println("min card is at location " + min);

		// problem 2
		deck.printPermutation( 3 );
		deck.printPermutation( 4 );
		deck.printPermutation( 5 );

		// problem 3
		final int UPPER_BOUND = 10;
		final int LOWER_BOUND = 0;
		
		MyPriorityQueue<Integer> pq = new MyPriorityQueue<Integer>();
		for (int i = 0; i < 10; i++) {
			pq.insert( LOWER_BOUND + (int) Math.random() * UPPER_BOUND);
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println( pq.remove() );
		}
	}
}
