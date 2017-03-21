package edu.calstatela.cs.jtran.lab10;

import java.util.ArrayList;

public class MyMap<K,V> {

	public void insert(Node<K,V> node) {
		if (!exist(node.key)) {
			collection.add( node );
		} else {
			Node<K,V> n = getNode( node.key );
			n.val = node.val;
		}
	}
	
	public void remove(K key) {
		Node<K,V> n = getNode(key);
		if(n != null) {
			collection.remove(n);
		}
	}
	
	public Node<K,V> getNode(K key) {
		for (Node<K,V> n : collection) {
			if (key.equals (n.key)) {
				return n;
			}
		}
		return null;
	}
	
	public V getVal(K key) {
		Node<K,V> n = getNode(key);
		if (n != null) {
			return n.val;
		} else {
			return null;
		}
	}

	public boolean exist(K key) {
		return getNode(key) != null;
	}
	
	private ArrayList<Node<K,V>> collection = 
			new ArrayList<Node<K,V>>();

	public static void main(String[] args) {
		MyMap<String,Integer> map = new MyMap<String,Integer>();
		map.insert( new Node<String,Integer>("john", 56) );
		map.insert( new Node<String,Integer>("george", 21) );
		map.insert( new Node<String,Integer>("elvira", 21) );
		map.insert( new Node<String,Integer>("kevin", 12) );
		map.insert( new Node<String,Integer>("john", 52) );
		
		for (Node<String,Integer> n : map.collection) {
			System.out.println(n);
		}
	}
}
