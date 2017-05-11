package edu.calstatela.cs.jtran.lab05;

/*
 * This implementation of a linked list is actually a queue
 */

public class LinkedList<E> {
	public void insert(E item) {
		Node<E> newNode = new Node<E>(item);
			
		if (head == null && tail == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public E remove() {
		if (head == null && tail == null) {
			return null;
		} else if (head == tail) {
			E data = head.data;
			head = null; tail = null;
			return data;
		} else {
			E data = head.data;
			head = head.next;
			return data;
		}
	}
	
	private Node<E> head;
	private Node<E> tail;
}
