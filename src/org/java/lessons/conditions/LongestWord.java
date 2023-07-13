package org.java.lessons.conditions;

import java.util.Scanner;

/*
* Chiediamo all'utente due parole in successione.
Andiamo poi a verificare quale delle due parole è più lunga e stampiamo in console un messaggio appropriato.*/
public class LongestWord {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("First word: ");
    String first = scan.nextLine();
    System.out.println("Second word: ");
    String second = scan.nextLine();

    if (first.length() > second.length()) {
      System.out.println(first + " is longer");
    } else if (second.length() > first.length()) {
      System.out.println(second + " is longer");
    } else {
      System.out.println("The words have same length");
    }
  }
}
