package org.java.lessons.variables;


import java.util.Scanner;

/*
 * Classe in cui salviamo quanti studenti usano Windows, Mac e Linux e
 * calcoliamo la percentuale sul totale degli studenti
 * INPUT: quanti utenti Win, Mac, Linux
 * OUTPUT: percentuale Win, Mac, Linux
 * */
public class OperatingSystemsSurvey {

  public static void main(String[] args) {
    // dichiaro che voglio uno scanner da tastiera
    Scanner scanner = new Scanner(System.in);

    // Variabili di cui avrò bisogno
    int totalUsers;
    int windowsUsers;
    int macUsers;
    int linuxUsers;

    double percWindows;
    double percMac;
    double percLinux;

    // assegno il valore alle variabili
// windowsUsers = 23;
    macUsers = 2;
    linuxUsers = 2;

    System.out.println("Number of Win users?");
    windowsUsers = scanner.nextInt();
    // calcolo il numero totale di utenti
    totalUsers = windowsUsers + macUsers + linuxUsers;
    System.out.println("Windows users: " + windowsUsers);
    System.out.println("Mac users: " + macUsers);
    System.out.println("Linux users: " + linuxUsers);
    System.out.println("Total users: " + totalUsers);

    // calcolo percentuale (FORMULA=numero/totale*100)
    percWindows = (double) windowsUsers / totalUsers * 100;
    percMac = (double) macUsers / totalUsers * 100;
    percLinux = (double) linuxUsers / totalUsers * 100;

    // valore atteso: %Windows=85,185, %Mac e %Linux=7,40
    System.out.println("Percentage Windows: " + percWindows);
    System.out.println("Percentage Mac: " + percMac);
    System.out.println("Percentage Linux: " + percLinux);


  }
}
