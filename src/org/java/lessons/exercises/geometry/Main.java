package org.java.lessons.exercises.geometry;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    // chiedo all'utente le dimensioni del rettangolo
    System.out.print("Base: ");
    int baseInput = Integer.parseInt(scan.nextLine());
    System.out.print("Height: ");
    int heightInput = Integer.parseInt(scan.nextLine());

    // costruisco un nuovo rettangolo
    Rectangle rectangle = new Rectangle(baseInput, heightInput);
    System.out.println("You created a rectangle with base " + rectangle.getBase() + " and height "
        + rectangle.getHeight());
    System.out.println("Area: " + rectangle.getArea());
    System.out.println("Perimeter: " + rectangle.getPerimeter());
    rectangle.draw('o');

    // rectangle.base = -1; base è private, non posso accedere

    scan.close();
  }
}
