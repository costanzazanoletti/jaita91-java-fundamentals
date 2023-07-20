package org.java.lessons.oop.salary;

/*
* Creare un programma che gestisce gli impiegati di un’azienda
Ogni impiegato ha nome, cognome, numero di anni di servizio e salario base.
Aggiungere un costruttore con tutti i parametri
Aggiungere un metodo per calcolare e restituire il salario effettivo dell’impiegato,
*  sapendo che sul salario base scatta un aumento del 5% ogni 5 anni di servizio
* */
public class Employee {

  // CAMPI
  private String firstName;
  private String lastName;

  private int years;

  private double baseSalary;

  private Address homeAddress;

  // COSTRUTTORI
  public Employee(String firstName, String lastName, int years, double baseSalary) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.years = years;
    this.baseSalary = baseSalary;
  }

  // GETTER E SETTER
  public void setHomeAddress(Address homeAddress) {
    this.homeAddress = homeAddress;
  }

  // METODI
  public double getActualSalary() {
    // sul salario base scatta un aumento del 5% ogni 5 anni di servizio
    // variabile per il salario attuale
    double actualSalary = baseSalary;
    // ciclo sugli anni per incrementarlo
    for (int i = 5; i <= years; i += 5) {
      double percentage = actualSalary * 0.05;
      actualSalary += percentage;
    }
    // restituisco il salario attuale
    return actualSalary;
  }

  public String getFullName() {
    return firstName.toUpperCase() + " " + lastName.toUpperCase();
  }

  @Override
  public String toString() {
    return "Employee{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", years=" + years +
        ", baseSalary=" + baseSalary +
        ", homeAddress=" + homeAddress +
        '}';
  }
}
