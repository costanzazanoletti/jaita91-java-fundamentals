package org.java.lessons.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String[] numbers = {"one", "two", "three"};

    System.out.println("Insert a number:");
    int number = 0;
    try {
      number = scan.nextInt();
      System.out.println("Your number is " + number);
      System.out.println(numbers[number]);
    } catch (InputMismatchException ie) {
      // codice
      System.out.println("Input mismatch");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Out of bounds");
    } finally {
      System.out.println("Close the scanner");
      scan.close();
    }

    System.out.println(number);

    System.out.println("bye bye");

  }
}
