package edu.calstatela.cs.jtran.lab14;

import java.util.ArrayList;

public class Tree {
	static final boolean RED = true;
	static final boolean BLACK = false;

	class Node {
		public int val;
		private Node left;
		private Node right;
		private boolean color;

		public Node(int val, boolean color) {
			this.val = val;
			this.color = color;
		}

		public String toString() {
			return "" + val;
		}
	}

	private Node colorFlip(Node x) {
		x.color = !x.color;
		x.left.color = !x.left.color;
		x.right.color = !x.right.color;
		return x;
	}

	private Node rotateLeft(Node h) {
		Node x = h.right;
		h.right = x.left;
		x.left = h;
		x.color = x.left.color;
		x.left.color = RED;
		return x;
	}

	private Node rotateRight(Node h) {
		Node x = h.left;
		h.left = x.right;
		x.right = h;
		x.color = x.right.color;
		x.right.color = RED;
		return x;
	}

	private boolean isRed(Node x) {
		if (x == null)
			return false;
		return (x.color == RED);
	}

	private Node insert(Node h, int val) {
		if (h == null) {
			return new Node(val, RED);
		}

		if (isRed(h.left) && isRed(h.right)) {
			colorFlip(h);
		}

		int cmp = val - h.val;
		if (cmp == 0) {
			h.val = val;
		} else if (cmp < 0) {
			h.left = insert(h.left, val);
		} else {
			h.right = insert(h.right, val);
		}

		if (isRed(h.right)) {
			h = rotateLeft(h);
		}

		if (isRed(h.left) && isRed(h.left.left)) {
			h = rotateRight(h);
		}

		return h;
	}

	private Node remove(Node h, int val) {
		/* implement the RB Treed node removal here */		
		return h;
	}
	
	private int rand(int min, int max) {
		int a = (int) (Math.random() * max + min);
		return a;
	}

	public static void main(String args[]) {
		new Tree().run();
	}

	public void run() {
		Node root = insert(null, 1);
		
		ArrayList<Integer> tracker = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			final int n = rand(1, 100);
			tracker.add(n);
			root = insert(root, n);
		}
		
		System.out.println("preorder: ");
		preOrder(root);
		System.out.println("");

		System.out.println("postorder: ");
		postOrder(root);
		System.out.println("");

		System.out.println("inorder: ");
		inOrder(root);
		System.out.println("");
		
		for (Integer n : tracker) {
			root = remove(root, n);
			System.out.println("Removing: " + n);
			inOrder(root);
			System.out.println("");
		}
	}
	
	void preOrder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node + " ");
		preOrder(node.left);
		preOrder(node.right);
	}

	void inOrder(Node node) {
		if (node == null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node + " ");
		inOrder(node.right);
	}

	void postOrder(Node node) {
		if (node == null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node + " ");
	}
}
