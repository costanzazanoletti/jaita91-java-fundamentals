package org.java.lessons.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {

  /*
   * scrivere un programma che chiede all’utente di inserire una parola
   * e gli risponde se è una parola palindroma oppure no
   * Una parola palindroma è una parola che si può leggere sia da
   * sinistra verso destra che da destra verso sinistra e mantiene stesso suono e lo stesso significato.
   * Ad esempio: OTTO, RADAR, ESOSE
   * */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Insert a word: ");
    String word = scan.nextLine();
    // verifico che la parola invertita (caratteri dall'ultimo al primo) è uguale alla parola data
    // trasformo la stringa in un char[]
    char[] wordChars = word.toCharArray();
    char[] revertedWordChars = new char[wordChars.length];
    // scorro il char[] all'indietro e copio tutti i caratteri in un altro char[]
    for (int i = wordChars.length - 1, j = 0; i >= 0; i--, j++) {
      char c = wordChars[i];
      System.out.println(c);
      System.out.println(j);
      revertedWordChars[j] = c;

    }

    System.out.println(Arrays.toString(revertedWordChars));
    // ricostruisco la stringa invertita
    String revertedWord = String.valueOf(revertedWordChars);
    // testo se le due stringhe sono uguali
    /*if (word.equals(revertedWord)) {
      System.out.println("Palindroma");
    } else {
      System.out.println("Not palindroma");
    }
    String message = word.equals(revertedWord) ? "Palindroma" : "Not Palindroma";*/
    System.out.println(word.equals(revertedWord) ? "Palindroma" : "Not Palindroma");
    scan.close();
  }
}
