package org.java.lessons.oop.salary;

import java.util.Scanner;

public class CompanyManagement {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("WELCOME TO COMPANY MANAGEMENT");
    System.out.print("Please insert company name: ");
    String companyName = scan.nextLine();
    System.out.print("Do you know the location?(Y/N)");
    String choice = scan.nextLine();
    // creo una company null
    Company company = null;
    // a seconda della scelta
    switch (choice.toUpperCase()) {
      case "Y":
        // chiedo di inserire l'indirizzo
        System.out.println("Please insert address");
        // chiedo il valore di tutti i campi dell'indirizzo
        System.out.print("city: ");
        String addressCity = scan.nextLine();
        System.out.print("street: ");
        String addressStreet = scan.nextLine();
        System.out.print("number: ");
        String addressNumber = scan.nextLine();
        System.out.print("postal code: ");
        String addressPostalCode = scan.nextLine();
        System.out.print("country: ");
        String addressCountry = scan.nextLine();
        // creo un oggetto indirizzo
        Address companyAddress = new Address(addressCity, addressStreet, addressPostalCode,
            addressNumber, addressCountry);
        // chiamo il costruttore di Company con nome e indirizzo
        company = new Company(companyName, companyAddress);
        break;
      case "N":
        // non chiedo l'indirizzo
        System.out.println("No address");
        // chiamo il costruttore di Company senza indirizzo
        company = new Company(companyName);
        break;
      default:
        System.out.println("Invalid choice");
        break;
    }

    // stampo i dati della company (solo se è stata creata)
    if (company != null) {
      System.out.println("COMPANY DATA ");
      System.out.println(company);
    }

    // termina il programma
    System.out.println("BYE BYE");
    scan.close();
  }
}
