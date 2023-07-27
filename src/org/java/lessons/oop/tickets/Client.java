package org.java.lessons.oop.tickets;

import java.time.LocalDate;
import java.time.Period;

public class Client {

  // ATTRIBUTI
  private String firstName;
  private String lastName;

  private LocalDate dateOfBirth;

  // COSTRUTTORI

  public Client(String firstName, String lastName, LocalDate dateOfBirth) throws RuntimeException {
    // CONTROLLI
    // se firstName è null o stringa vuota
    if (firstName == null || firstName.isEmpty()) {
      // sollevo un'eccezione
      throw new RuntimeException("first name must not be null or empty");
    }

    // se lastName è null o stringa vuota
    if (lastName == null || lastName.isEmpty()) {
      // sollevo un'eccezione
      throw new RuntimeException("last name must not be null or empty");
    }

    // se dateOfBirth è null o nel futuro
    if (dateOfBirth == null || dateOfBirth.isAfter(LocalDate.now())) {
      // sollevo un'eccezione
      throw new RuntimeException("date of birth must not be null or in the future");
    }
    this.firstName = firstName;
    this.lastName = lastName;
    this.dateOfBirth = dateOfBirth;
  }

  // GETTER e SETTER

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) throws RuntimeException {
    // ANCHE QUI VALIDAZIONE
    if (firstName == null || firstName.isEmpty()) {
      // sollevo un'eccezione
      throw new RuntimeException("first name must not be null or empty");
    }
    // SOLO SE PASSA ALLORA MODIFICO IL VALORE
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) throws RuntimeException {
    if (lastName == null || lastName.isEmpty()) {
      throw new RuntimeException("last name must not be null or empty");
    }
    this.lastName = lastName;
  }

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) throws RuntimeException {
    if (dateOfBirth == null || dateOfBirth.isAfter(LocalDate.now())) {
      throw new RuntimeException("date of birth must not be null or in the future");
    }
    this.dateOfBirth = dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirthString)
      throws IllegalArgumentException, RuntimeException {
    LocalDate dateOfBirthInput = null;
    // converto la stringa in data
    try {
      dateOfBirthInput = LocalDate.parse(dateOfBirthString);
    } catch (Exception e) {
      throw new IllegalArgumentException("invalid date format");
    }
    // valido
    if (dateOfBirthInput.isAfter(LocalDate.now())) {
      throw new RuntimeException("date of birth must not be null or in the future");
    }
    // setto l'attributo
    this.dateOfBirth = dateOfBirthInput;
  }

  // METODI
  public int getAge() {
    Period agePeriod = Period.between(dateOfBirth, LocalDate.now());
    return agePeriod.getYears();
  }

  @Override
  public String toString() {
    return "Client{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", dateOfBirth=" + dateOfBirth +
        '}';
  }
}
