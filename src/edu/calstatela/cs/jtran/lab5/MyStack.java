package edu.calstatela.cs.jtran.lab5;

public class MyStack<E> {
	public MyStack(int sz) {
		allocate(sz);
	}
	public MyStack() {
		allocate(SIZE);
	}
	public int getSize() {
		return idx + 1;
	}
	public void push(E item) {
		array[idx] = item;
		idx = idx + 1;
	}
	public E pop() {
		idx = idx - 1;
		return (E)array[idx];
	}

	private void allocate(int sz) {
		array = new Object[sz];
	}
	private final int SIZE = 100;
	private Object array[];
	private int idx = 0;
}
