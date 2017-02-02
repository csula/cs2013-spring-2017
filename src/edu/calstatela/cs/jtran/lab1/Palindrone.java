package edu.calstatela.cs.jtran.lab1;

public class Palindrone {

  public static void main(String[] args) {
    String testString1 = "yobananaboy";
    String testString2 = "yobananagirl";

    Palindrone p = new Palindrone();

    System.out.println(testString1 + " is a palindrone: "
              + p.check2(testString1));
    System.out.println(testString2 + " is a palindrone: "
              + p.check2(testString2));
  }

  boolean check1(String str) {
    StringBuilder s2 = new StringBuilder(str);
    return str.equals(s2.reverse().toString());
  }

  boolean check2(String str) {

    int len = str.length();
    for (int i = 0; i < len; i++) {
      if (str.charAt(i) != str.charAt(len - i - 1)) {
        return false;
      }
    }

    return true;
  }
}
