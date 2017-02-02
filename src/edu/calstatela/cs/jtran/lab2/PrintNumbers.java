package edu.calstatela.cs.jtran.lab2;

public class PrintNumbers {

  public static void main(String[] args) {
    new PrintNumbers().print(1);
  }

  public static final int N = 10;

  /*
   * base case: number = N
   * induction step: increment number, call fn with number
   *
      print(number + 1);   */

  void print(final int number) {
    // base case
    if (number == N) {
      return;
    } else {
    // induction step
      System.out.println(number);
      print(number + 1);
    }
  }

}
