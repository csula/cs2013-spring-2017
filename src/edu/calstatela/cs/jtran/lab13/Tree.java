package edu.calstatela.cs.jtran.lab13;

public class Tree {
	void preOrder(TreeNode node) {
		if (node == null) { return ; }
		System.out.print(node + " ");
		preOrder(node.L);
		preOrder(node.R);
	}
	
	void inOrder(TreeNode node) {
		if (node == null) { return ; }
		inOrder(node.L);
		System.out.print(node + " ");
		inOrder(node.R);
	}
	
	void postOrder(TreeNode node) {
		if (node == null) { return ; }
		postOrder(node.L);
		postOrder(node.R);
		System.out.print(node + " ");
	}
	
	TreeNode insert(TreeNode h, int val) {
		if (h == null) {
			return new TreeNode(val);
		}
		int cmp = val - h.val;
		if (cmp == 0) {
			h.val = val; 
		} else if (cmp < 0) {
		    h.L = insert(h.L, val);
		} else {
		    h.R = insert(h.R, val);
		}
		return h;
	}

	int rand(int min, int max) {
		int a = (int)(Math.random() * max + min);
		System.out.print(a + " ");
		return a;
	}
	
	TreeNode root = null;
	
	public void run() {
		root = insert( null, rand(1,10) );
		for (int i = 0; i < 10; i++) {
			insert( root, rand(1,10) );
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
