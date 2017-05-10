package edu.calstatela.cs.jtran.lab05;

public class App {

	public static void main(String[] args) {
		MyStack<String> stack = new MyStack<String>(5);
		stack.push( "three" );
		stack.push( "four" );
		stack.push( "five" );
		for (int i = 0; i < 3; i++) { 
			System.out.println(stack.pop() + " " + stack.getSize() );
		}
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.insert( "ten" );
		ll.remove();
		ll.insert( "nine" );
		ll.insert( "eight" );
		for (int j = 0; j < 3; j++) {
			System.out.println( ll.remove() );
		}
		
		LLStack<String> lls = new LLStack<String>();
		lls.push( "red" );
		lls.push( "white" );
		lls.push( "blue" );
		for (int k = 0; k < 3; k++) {
			System.out.println( lls.pop() );
		}
	}
}
