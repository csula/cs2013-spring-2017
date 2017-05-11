package edu.calstatela.cs.jtran.lab05;

public class LLStack<E> {
	public void push(E item) {
		Node<E> newNode = new Node<E>(item);
			
		if (head == null && tail == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}
	
	public E pop() {
		if (head == null && tail == null) {
			return null;
		} else {
			E data = head.data;
			head = head.next;
			return data;
		}
	}
	
	private Node<E> head;
	private Node<E> tail;
}
