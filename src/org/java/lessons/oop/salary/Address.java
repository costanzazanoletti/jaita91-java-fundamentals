package org.java.lessons.oop.salary;

public class Address {

  //1 CAMPI
  private String city;
  private String street;
  private String postalCode;
  private String number;
  private String country;
  //2 COSTRUTTORI

  public Address(String city, String street, String postalCode, String number, String country) {
    this.city = city;
    this.street = street;
    this.postalCode = postalCode;
    this.number = number;
    this.country = country;
  }

  //3 GETTERS e SETTERS

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  //4 METODI

  @Override
  public String toString() {
    return "Address{" +
        "city='" + city + '\'' +
        ", street='" + street + '\'' +
        ", postalCode='" + postalCode + '\'' +
        ", number='" + number + '\'' +
        ", country='" + country + '\'' +
        '}';
  }
}
