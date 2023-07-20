package org.java.lessons.oop.salary;

public class Company {

  // 1 CAMPI
  private String name;
  private Address location;

  // 2 COSTRUTTORI
  // costruttore con tutti i parametri

  public Company(String name, Address location) {
    this.name = name;
    this.location = location;
  }

  // costruttore solo col nome
  public Company(String name) {
    this.name = name;
  }
  // 3 GETTERS E SETTERS

  // 4 METODI

  @Override
  public String toString() {
    return "Company{" +
        "name='" + name + '\'' +
        ", location=" + location +
        '}';
  }
}
