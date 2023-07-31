package org.java.lessons.classscope;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Temperature in celsius: ");
    double celsius = scan.nextDouble();

    System.out.println(
        "Temperature in fahrenheit: " + TemperatureConverter.celsiusToFahrenheit(celsius));

    scan.close();
  }
}
