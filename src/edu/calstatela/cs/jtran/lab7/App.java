package edu.calstatela.cs.jtran.lab7;

public class App {

	public static void emptyTheQueue( MyPriorityQueue<Integer> pq ) {
		if (pq.isEmpty()) {
			// base case
			return;
		} else {
			// induction step
			System.out.println( pq.remove() );
			emptyTheQueue( pq );
		}
	}
	
	public static void main(String[] args) {
		try {
			final int MAX = 20;
			MyPriorityQueue<Integer> pq = 
					new MyPriorityQueue<Integer>( new MyComparator() );
			for (int i = 0; i < 5; i++) {
				pq.insert( new Integer((int) (Math.random() * MAX + 1)) );
			}
			pq.dump(); // see what's in the queue
			System.out.println("max is " + pq.max() );
			System.out.println("--");
			emptyTheQueue( pq );
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
