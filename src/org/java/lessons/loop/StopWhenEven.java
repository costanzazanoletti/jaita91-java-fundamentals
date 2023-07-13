package org.java.lessons.loop;

import java.util.Scanner;

/*
 * Continuare a chiedere all'utente di inserire un numero.
 * Fermarsi quando il numero è pari
 * */
public class StopWhenEven {

  public static void main(String[] args) {
    // inizializzo lo Scanner
    Scanner scan = new Scanner(System.in);

    int num;
    do {
      System.out.print("Insert a number: ");
      num = Integer.parseInt(scan.nextLine());
    } while (num % 2 != 0);
    System.out.println("The first even number is " + num);

    scan.close();
  }
}
