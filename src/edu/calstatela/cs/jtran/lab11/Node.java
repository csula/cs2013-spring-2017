package edu.calstatela.cs.jtran.lab11;

public class Node<K,V> {
	K key;
	V val;
	
	Node(K key, V val) {
		this.key = key;
		this.val = val;
	}
	
	public String toString() {
		return "[k=" + key + " v=" + val + "]";
	}
}
