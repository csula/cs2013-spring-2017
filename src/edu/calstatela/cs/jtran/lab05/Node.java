package edu.calstatela.cs.jtran.lab05;

public class Node<E> {
	Node(E e) {
		data = e;
	}
	public E data;
	public Node<E> next;
}
