package org.java.lessons.oop.tickets;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Client client = null;
    // resto in questo ciclo fino a che non ho costrito il cliente
    while (client == null) {
      // prendo i dati con lo scanner
      System.out.println("First name: ");
      String firstName = scan.nextLine();
      System.out.println("Last name: ");
      String lastName = scan.nextLine();
      System.out.println("Date of birth (yyyy-MM-dd): ");
      LocalDate dateOfBirth = null;
      try {
        dateOfBirth = LocalDate.parse(scan.nextLine());
      } catch (Exception e) {
        System.out.println("Invalid date format");
      }
      // provo a creare un cliente con quei dati
      try {
        client = new Client(firstName, lastName, dateOfBirth);
      } catch (RuntimeException e) {
        System.out.println("Invalid parameters");
        System.out.println(e.getMessage());
      }
    }

    // mostro il cliente e calcolo lo sconto

    System.out.println(client);
    // calcolo l'età
    int age = client.getAge();
    if (age < 12) {
      System.out.println("Discount children");
    } else if (age >= 65) {
      System.out.println("Discount over 65");
    }

    scan.close();


  }
}
