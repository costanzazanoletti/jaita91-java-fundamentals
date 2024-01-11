package org.java.lessons.abstraction;

public class Airplane implements CanFly {

  // ATTRIBUTI
  private int fuelLevel;

  // COSTRUTTORI
  public Airplane() {
    fuelLevel = 300;
  }

  // METODI SOLO DI AIRPLANE
  private void useFuel(int amount) {
    fuelLevel = fuelLevel - amount;

  }

  private void addFuel(int amount) {
    fuelLevel = fuelLevel + amount;
  }

  private void printFuelLevel() {
    System.out.println("Fuel level: " + fuelLevel);
  }

  // METODI DELL'INTERFACCIA CanFly
  @Override
  public void flyUp(int pixel) {
    System.out.println("Fly up " + pixel);
    useFuel(pixel);
    printFuelLevel();
  }

  @Override
  public void flyDown(int pixel) {
    System.out.println("Fly down " + pixel);
    useFuel(pixel);
    printFuelLevel();
  }

  @Override
  public void flyRight(int pixel) {
    System.out.println("Fly right " + pixel);
    useFuel(pixel);
    printFuelLevel();

  }

  @Override
  public void flyLeft(int pixel) {
    System.out.println("Fly left " + pixel);
    useFuel(pixel);
    printFuelLevel();
  }

  @Override
  public void land() {
    System.out.println("Landed");
    addFuel(100);
    printFuelLevel();
  }
}
