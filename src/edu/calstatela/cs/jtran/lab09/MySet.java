package edu.calstatela.cs.jtran.lab09;

import java.util.ArrayList;

public class MySet<E extends Comparable<E>>{
	
	public void Insert(E item) {
		if (!Exist(item)) {
			myPrivateCollection.add(item);
		}
	}
	
	public void Remove(E item) {
		for (E e: myPrivateCollection) {
			if (e.compareTo(item) == 0) {
				myPrivateCollection.remove(e);
			}
		}
	}
	
	public boolean isEmpty() {
		return myPrivateCollection.size() == 0;
	}
	
	public boolean Exist(E item) {
		boolean status = false;
		for (E e: myPrivateCollection) {
			if (e.compareTo(item) == 0) {
				return true;
			}
		}
		return status;
	}
	
	public ArrayList<E> getAll() { 
		return myPrivateCollection; 
	}
	
	private ArrayList<E> myPrivateCollection = new ArrayList<E>();
}
