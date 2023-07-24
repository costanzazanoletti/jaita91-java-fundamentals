package org.java.lessons.oop.bank;

import java.math.BigDecimal;
import java.util.Random;
import java.util.Scanner;

public class BankUI {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random random = new Random();

    System.out.println("*** WELCOME TO JAVA BANK ***");
    // chiedo all'utente nome
    System.out.print("You name: ");
    String name = scan.nextLine();
    // genero codice random (1-1000)
    int code = random.nextInt(1, 1001);
    // creo un conto
    Account account = new Account(code, name);
    System.out.println(account);

    // menu continuo finchè l'utente decide di uscire
    boolean exit = false;
    while (!exit) {
      System.out.println("Choose operation: 1-deposit 2-withdraw 3-exit");
      String choice = scan.nextLine();
      // testo la scelta utente con uno switch
      switch (choice) {
        case "1":
          System.out.println("Deposit");
          // chiedo l'importo da versare
          System.out.print("Deposit amount: ");
          BigDecimal depositAmount = new BigDecimal(scan.nextLine());
          // provo a versare e tengo in una variabile il risultato
          boolean depositResult = account.deposit(depositAmount);
          // se risultato positivo stampo il saldo corrente
          if (depositResult) {
            System.out.println("Success! Current balance: " + account.getBalance() + "€");
          } else {
            // altrimenti stampo messaggio di errore
            System.out.println("Error! Unable to deposit");
          }
          break;
        case "2":
          System.out.println("Withdraw");
          // chiedo l'importo da prelevare
          System.out.print("Withdraw amount: ");
          BigDecimal withdrawAmount = new BigDecimal(scan.nextLine());
          // provo a prelevare
          boolean withdrawResult = account.withdraw(withdrawAmount);
          if (withdrawResult) {
            System.out.println("Success! Current balance: " + account.getBalance() + "€");
          } else {
            System.out.println("Error! Unable to withdraw");
          }
          break;
        case "3":
          System.out.println("Exit");
          // cambio il valore del flag exit
          exit = true;
          break;
        default:
          System.out.println("Invalid choice");
          break;
      }
    }
    System.out.println("Bye Bye");
    scan.close();
  }
}
