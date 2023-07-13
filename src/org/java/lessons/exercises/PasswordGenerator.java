package org.java.lessons.exercises;

import java.util.Scanner;

public class PasswordGenerator {

  public static void main(String[] args) {
    // definisco le variabili
    String firstName;
    String lastName;
    String favoriteColor;
    int dayOfBirth;
    int monthOfBirth;
    int yearOfBirth;

    // creo un oggetto Scanner
    Scanner scan = new Scanner(System.in);
    /*
    // assegno un valore alle variabili
    firstName = "Pinco";
    lastName = "Pallo";
    favoriteColor = "yellow";
    dayOfBirth = 10;
    monthOfBirth = 6;
    yearOfBirth = 1995;
*/

    // menu interattivo
    System.out.println("Your first name: ");
    firstName = scan.nextLine();
    System.out.println("Your last name: ");
    lastName = scan.nextLine();
    System.out.println("Your favorite color: ");
    favoriteColor = scan.nextLine();
    System.out.println("Your day of birth: ");
    dayOfBirth = Integer.parseInt(scan.nextLine());
    System.out.println("Your month of birth: ");
    monthOfBirth = Integer.parseInt(scan.nextLine());
    System.out.println("Your year of birth: ");
    yearOfBirth = Integer.parseInt(scan.nextLine());

    // calcolo della password
    // somma di giorno+mese+anno di nascita
    int sumDateOfBirth = dayOfBirth + monthOfBirth + yearOfBirth;
    // String generatedPassword =firstName + "-" + lastName + "-" + favoriteColor + "-" + sumDateOfBirth;
    String generatedPassword =
        firstName + "-" + lastName + "-" + favoriteColor + "-" + (dayOfBirth + monthOfBirth
            + yearOfBirth);

    System.out.println("Generated password: " + generatedPassword);

    // chiudo lo Scanner
    scan.close();
  }

}
