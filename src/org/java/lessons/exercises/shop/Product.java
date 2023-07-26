package org.java.lessons.exercises.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashSet;
import java.util.Random;

public class Product {

  // ATTRIBUTI
  private int code;
  private String name;
  private String description;

  private BigDecimal price;

  private BigDecimal vat;

  private HashSet<Category> categories;

  // COSTRUTTORI
/*  public Product() {
    this.code = generateCode();
  }*/

  public Product(String name, String description, BigDecimal price, BigDecimal vat) {
    this.code = generateCode();
    this.name = name;
    this.description = description;
    this.price = price;
    this.vat = vat;
  }
  // GETTERS e SETTERS

  public int getCode() {
    return code;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public BigDecimal getVat() {
    return vat;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public void setVat(BigDecimal vat) {
    this.vat = vat;
  }

  public HashSet<Category> getCategories() {
    return categories;
  }

  public void setCategories(HashSet<Category> categories) {
    this.categories = categories;
  }

  // METODI
  // metodo che calcola il prezzo comprensivo di iva
  public BigDecimal getFullPrice() {
    // prezzo completo = prezzo base + iva sul prezzo
    // fullPrice = price + price*vat
    BigDecimal vatOnPrice = price.multiply(vat);
    BigDecimal fullPrice = price.add(vatOnPrice);
    // prima di ritornare il prezzo setto la scala
    return fullPrice.setScale(2, RoundingMode.HALF_EVEN);

  }

  // metodo per calcolare il nome esteso codice - nome
  public String getFullName() {
    return getPaddedCode() + "-" + name;
  }

  // metodo di utility per mettere il pad left al code
  private String getPaddedCode() {
    // trasformo il codice in stringa
    String paddedCode = Integer.toString(code);
    // fino a che la stringa non è lunga 8 aggiungo uno 0 davanti
    while (paddedCode.length() < 8) {
      paddedCode = "0" + paddedCode;
    }
    return paddedCode;
  }

  // metodo di utility che calcola il valore generato del codice
  private int generateCode() {
    Random random = new Random();
    return random.nextInt(1, 10000);
  }

  @Override
  public String toString() {
    return getFullName() + " " + description + ", price: " + getFullPrice() + "€";
  }
}
