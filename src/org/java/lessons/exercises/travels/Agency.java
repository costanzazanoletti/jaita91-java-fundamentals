package org.java.lessons.exercises.travels;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Agency {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    boolean exit = false;
    System.out.println("Welcome to Java Travel Agency");
    while (!exit) {
      System.out.print("1-Insert new holiday 2-Exit");
      String choice = scan.nextLine();
      switch (choice) {
        case "1":
          try {
            System.out.println("Insert new holiday");
            // chiedo all'utente il valore dei campi
            System.out.print("Destination: ");
            String destination = scan.nextLine();
            System.out.print("Start date (yyyy-MM-dd): ");
            LocalDate startDate = LocalDate.parse(scan.nextLine());
            System.out.print("End date (yyyy-MM-dd): ");
            LocalDate endDate = LocalDate.parse(scan.nextLine());
            // con quei valori creo una Holiday
            Holiday holiday = new Holiday(destination, startDate, endDate);
            System.out.println("You created an holiday to " + holiday.getDestination() + " of "
                + holiday.getDurationInDays() + " days");
          } catch (DateTimeParseException e) {
            System.out.println("Date must be in format yyyy-MM-dd and a valid date");
          } catch (InvalidDestinationException e) {
            System.out.println("Destination must not be null or blank");
          } catch (NullPointerException e) {
            System.out.println("Parameter must not be null ");
            System.out.println(e.getMessage());
          } catch (InvalidDateException e) {
            System.out.println("Invalid date: " + e.getMessage());
          }
          break;
        case "2":
          System.out.println("Bye Bye");
          exit = true;
          break;
        default:
          System.out.println("Invalid choice");
          break;
      }

    }

    scan.close();
  }
}
