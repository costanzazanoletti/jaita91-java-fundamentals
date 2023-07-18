package org.java.lessons.oop.cars;

public class Car {

  // CAMPI
  String brand;
  String model;
  String color;
  int year;

  // COSTRUTTORI
  Car() {
    brand = "Default brand";
    model = "Default model";
    color = "White";
    year = 2023;
  }

  Car(String brand, String model, String color, int year) {
    this.brand = brand;
    this.model = model;
    this.color = color;
    this.year = year;
  }

  Car(String brand, String model, int year) {
    this.brand = brand;
    this.model = model;
    this.year = year;
  }

  // METODI
  // metodo che prende in ingresso brand e model e li assegna ai campi dell'oggetto
  void setBrandModel(String brandIn, String modelIn) {
    brand = brandIn;
    model = modelIn;
  }

  @Override
  public String toString() {
    return "Car{" +
        "brand='" + brand + '\'' +
        ", model='" + model + '\'' +
        ", color='" + color + '\'' +
        ", year=" + year +
        '}';
  }
}
