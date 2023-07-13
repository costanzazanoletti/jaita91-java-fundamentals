package org.java.lessons.loop;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Chiedere all’utente di inserire una lista di numeri separati da virgola (ad es: 3,5,6,14,99,210)
 * e stampare in console quanti numeri ha inserito in tutto e quanti di questi sono numeri sono pari
 * */
public class NumberList {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // prendere la stringa con la lista di numeri
    System.out.println("Insert a list of numbers separated by ,");
    String numList = scan.nextLine();

    // trasformo la stringa di numeri concatenati in un array
    String[] splittedNumList = numList.split(",");
    System.out.println(Arrays.toString(splittedNumList));

    // per sapere quanti numeri ha inserito in tutto mostro la lunghezza dell'array
    System.out.println("You inserted " + splittedNumList.length + " numbers");

    // dichiariamo una variabile in cui tenere conto del numero di elementi pari
    // la inizializzo con 0
    int counter = 0;
    // cicliamo su tutti gli elementi dell'array
    for (int i = 0; i < splittedNumList.length; i++) {
      System.out.println(splittedNumList[i]);
      // se il numero corrente è pari allora aumento il contantore di 1
      if (Integer.parseInt(splittedNumList[i]) % 2 == 0) {
        counter++;
      }
    }

    // stampo il valore del contatore
    System.out.println("Number of even elements: " + counter);
    // chiudo lo scanner
    scan.close();

  }
}
