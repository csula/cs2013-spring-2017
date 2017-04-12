package edu.calstatela.cs.jtran.lab12;

public class InsertionSort {

	public void sort(int a[]) {
		int holePosition, valueToInsert;
		
		for (int i = 1; i <= a.length; i++) {
			valueToInsert = a[i];
			holePosition = i;
			while ( holePosition > 0 && a[holePosition - 1] > valueToInsert ) {
				a[holePosition] = a[holePosition - 1];
				holePosition = holePosition - 1;
			}
			
			a[holePosition] = valueToInsert;
		}
	}
	
	public void print(int[] a) {
		System.out.print("[ ");
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println("]");
	}
	
	public void run(final int sz, final int lb, final int ub) {
		int a[] = new int[sz];
		for (int i = 0; i < sz; i++) {
			a[i] = (int)(Math.random() * ub + lb);
		}
		print(a);
		sort(a);
		print(a);
	}
	
	public static void main(String[] args) {
		new InsertionSort().run(5, 1, 100);
	}

}
