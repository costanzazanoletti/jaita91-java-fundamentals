package org.java.lessons.classscope;

public class TemperatureConverter {

  private TemperatureConverter() {
    // non fa niente
  }

  // ho dichiarato una costante di classe
  public final static int DIFF = 32;

  public static double celsiusToFahrenheit(double c) {
    return (c * 9 / 5) + DIFF;
  }

  public static double farhenheitToCelsius(double f) {
    return (f - DIFF) * 5 / 9;
  }

}
