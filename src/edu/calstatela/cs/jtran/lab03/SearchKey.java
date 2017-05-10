package edu.calstatela.cs.jtran.lab03;

public class SearchKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int[] array = { 1, 2, 1, 5, 7 };
		final int sk = 1;
		int v = (new SearchKey()).Search(sk, array, 0);
		System.out.println(v);
	}
	
	int Search(final int sk, final int[] array, final int pos) {
		final int myStatus = (array[pos] == sk) ? 1 : 0;
		
		// base case: if reach end of the array
		if (pos == array.length - 1) {
			return myStatus;
		}
		// induction step:
		return myStatus + Search(sk, array, pos + 1);
	}
	

}
