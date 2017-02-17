package edu.calstatela.cs.jtran.lab5;

public class Node<E> {
	Node(E e) {
		data = e;
	}
	public E data;
	public Node<E> next;
}
