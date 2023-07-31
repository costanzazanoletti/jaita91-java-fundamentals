package org.java.lessons.abstraction;

import java.util.Scanner;

public class FlyGame {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Which character? 1-airplane 2-sparrow");
    String choice = scanner.nextLine();
    System.out.println("You choose " + choice);
    // Preparo una variabile di tipo CanFly
    CanFly character = null;
    // a seconda della scelta dell'utente creo un Airplane o uno Sparrow
    if (choice.equals("1")) {
      // scelta 1 -> Airplane
      character = new Airplane();
    } else if (choice.equals("2")) {
      // scelta 2 -> Sparrow
      character = new Sparrow("Jack");
    } else {
      System.out.println("Invalid choice");
    }
    // posso far volare qualsiasi personaggio allo stesso modo
    if (character != null) {
      character.flyUp(10);
      character.flyDown(5);
      character.flyRight(7);
      character.land();
    }


  }
}
