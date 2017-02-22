package edu.calstatela.cs.jtran.lab7;

import java.util.ArrayList;
import java.util.Comparator;

public class MyPriorityQueue<E> {
	
	MyPriorityQueue() throws Exception {
		throw new Exception("naked priority is disallowed");
	}
	
	MyPriorityQueue(Comparator<E> comparator) {
		this.comparator = comparator;
		container = new ArrayList<E>();
	}
	
	public void insert(E item) {
		container.add( item );
	}
	
	public void dump() {
		for (E item : container) {
			System.out.println( item );
		}
	}
	
	public E remove() {
		E max = container.get( 0 );
		int max_idx = 0;
		
		for (int i = 1; i < container.size(); i++) {
			E current = container.get(i);
			if (comparator.compare(max, current) == 1 ) {
				max = current;
				max_idx = i;
			}
		}
		
		E item = container.remove( max_idx );
		
		return item;
	}
	
	public boolean isEmpty() { return container.size() == 0; }
	
	private Comparator<E> comparator;
	private ArrayList<E> container;
}
