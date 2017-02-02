package edu.calstatela.cs.jtran.lab2;

public class SumNumber {

	public static void main(String[] args) {
		int v = (new SumNumber()).calc(1);
		System.out.println(v);
	}
	
	public static final int N = 4;
	
	/*
	 * base case: number = N
	 * induction step: increment number, 
	 *    add number to fn with incremented number
	 *    return value from above
	 * 
			print(number + 1);	 */
	
	int calc(final int number) {
		// base case
		if (number == N) {
			return number;
		} else {
			return number + calc(number + 1);
		}
	}
	
}
