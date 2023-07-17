package org.java.lessons.exercises;

import java.util.Scanner;

/*
*
* - creare e inizializzare l’array contenente i nomi degli invitati
- chiedere all’utente come si chiama
- verificare che il nome sia presente nella lista
- lasciarlo entrare o rispedirlo cortesemente da dove è venuto
* */
public class CheckGuest {

  public static void main(String[] args) {
    // 1) creare e inizializzare l’array contenente i nomi degli invitati
    String[] guests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti",
        "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

    // 2) chiedere all’utente come si chiama
    Scanner scan = new Scanner(System.in);
    System.out.print("What's your name?");
    String userName = scan.nextLine();
    // 3) verificare che il nome sia presente nella lista
    // dichiaro una variabile in cui tenere traccia se ho trovato il nome
    boolean found = false;
    for (int i = 0; i < guests.length && !found; i++) {
      // ad ogni iterazione del ciclo confronto il nome dell'utente con il nome alla posizone corrente
      if (guests[i].equalsIgnoreCase(userName)) {
        found = true;
        //break;
      }
    }

    // 3) lasciarlo entrare o rispedirlo cortesemente da dove è venuto
    // la variabile found mi dice se ho trovato o no il nome nella lista
    if (found) {
      System.out.println("Welcome!");
    } else {
      System.out.println("Sorry you're not in the list");
    }

    // chiudo lo scanner
    scan.close();
  }
}
