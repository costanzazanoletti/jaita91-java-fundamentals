package org.java.lessons.loop;

import java.util.Scanner;

/*
 * Continuare a chiedere all'utente di inserire un numero.
 * Fermarsi quando il numero è pari e maggiore di 10
 * */
public class StopWhenEven {

  public static void main(String[] args) {
    // inizializzo lo Scanner
    Scanner scan = new Scanner(System.in);
/*
    // dichiaro una variabile intero dove mettere i numeri che mi dice l'utente
    int num;
    do {
      System.out.print("Insert a number: ");
      num = Integer.parseInt(scan.nextLine());
    } while (num % 2 != 0 || num <= 10);

    System.out.println("The first even number is " + num);
*/

    // variabile booleana che fa da "semaforo"
    boolean stop = false;

    while (!stop) {
      System.out.print("Insert a number: ");
      int num = Integer.parseInt(scan.nextLine());
      //verifico se il numero è pari e > 10
      if (num % 2 == 0 && num > 10) {
        // cambio il valore del semaforo
        stop = true;
        System.out.println("The first even number greater than 10 is " + num);
      }
    }

    scan.close();
  }
}
