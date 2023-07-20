package org.java.lessons.collections;

import java.util.ArrayList;
import java.util.Scanner;

/* chiedo all'utente di creare una lista dei desideri */
public class WishList {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // creo la lista vuota
    ArrayList<String> wishList = new ArrayList<>();
    System.out.println(wishList.size());
    System.out.println(wishList.isEmpty());

    // variabile flag che mi dice se devo uscire dal ciclo
    boolean exit = false;
    do {
      // chiedo se vuoi inserire un desiderio (Y)
      System.out.print("Do you want to add a wish?");
      String answer = scan.nextLine();

      if (answer.equalsIgnoreCase("Y")) {
        // se Y chiedo il desiderio
        System.out.print("Wish: ");
        String wish = scan.nextLine();
        // aggiungo il desiderio alla lista
        wishList.add(wish);
        // mostro quanto è grande la lista ora
        System.out.println("You have " + wishList.size() + " wishes");
      } else {
        // se non è Y cambio il valore al flag per uscire dal ciclo
        exit = true;
      }

    } while (!exit); // exit == false

    System.out.println(wishList);
    System.out.println("BYE BYE");
    scan.close();
  }
}
