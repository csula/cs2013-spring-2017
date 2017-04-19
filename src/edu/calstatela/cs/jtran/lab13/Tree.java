package edu.calstatela.cs.jtran.lab13;

public class Tree {
	void add(TreeNode node) {
		
	}
	
	void preOrder(TreeNode node) {
		System.out.println(node);
		preOrder(node.L);
		preOrder(node.R);
	}
	
	void inOrder(TreeNode node) {
		inOrder(node.L);
		System.out.println(node);
		inOrder(node.R);
	}
	
	void postOrder() {
		
	}
	
	public void run() {
		
	}
	
	public static void main(String args[]) {
		new Tree().run();
	}
}
