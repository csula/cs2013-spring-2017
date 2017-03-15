package edu.calstatela.cs.jtran.lab10;

import java.util.ArrayList;

public class MyMap {

	public void insert(Node<String,Integer> node) {
		if (!exist(node.key)) {
			collection.add( node );
		} else {
			Node<String,Integer> n = getNode( node.key );
			n.val = node.val;
		}
	}
	
	public void remove(String key) {
		Node<String,Integer> n = getNode(key);
		if(n != null) {
			collection.remove(n);
		}
	}
	
	public Node<String,Integer> getNode(String key) {
		for (Node<String,Integer> n : collection) {
			if (key.equals (n.key)) {
				return n;
			}
		}
		return null;
	}
	
	public Integer getVal(String key) {
		Node<String,Integer> n = getNode(key);
		if (n != null) {
			return n.val;
		} else {
			return null;
		}
	}

	public boolean exist(String key) {
		return getNode(key) != null;
	}
	
	private ArrayList<Node<String,Integer>> collection = 
			new ArrayList<Node<String,Integer>>();

	public static void main(String[] args) {

	}
}
