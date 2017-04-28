package edu.calstatela.cs.jtran.lab14;

public class Tree {
	static final boolean RED = true;
	static final boolean BLACK = false;

	class Node {
		public int val;
		Node left;
		Node right;
		boolean color;

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

	Node insert(Node h, int val) {
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

	private boolean isRed(Node x) {
		if (x == null)
			return false;
		return (x.color == RED);
	}

	int rand(int min, int max) {
		int a = (int) (Math.random() * max + min);
		System.out.print(a + " ");
		return a;
	}

	Node root = null;

	public void run() {
		root = insert(null, 1);
		for (int i = 0; i < 10; i++) {
			root = insert(root, i);
			root = insert(root, i * 2);
		}
		
		System.out.println("");
		System.out.println("--");
		preOrder(root);
		System.out.println("");

		System.out.println("--");
		postOrder(root);
		System.out.println("");

		System.out.println("--");
		inOrder(root);
		System.out.println("");
	}

	public static void main(String args[]) {
		new Tree().run();
	}
}
