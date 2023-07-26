package org.java.lessons.exercises.shop;

import java.math.BigDecimal;

public class Television extends Product {

  // ATTRIBUTI
  private int dimensions;
  private boolean isSmart;
  //COSTRUTTORI
/*  public Television(String name, String description, BigDecimal price,
      BigDecimal vat) {
    super(name, description, price, vat);
  }*/

  public Television(String name, String description, BigDecimal price, BigDecimal vat,
      int dimensions,
      boolean isSmart) {
    // chiama il costruttore della superclasse (Product)
    super(name, description, price, vat);
    // inizializza gli attributi propri di Tevision
    this.dimensions = dimensions;
    this.isSmart = isSmart;
  }
  //GETTER E SETTER

  public int getDimensions() {
    return dimensions;
  }

  public void setDimensions(int dimensions) {
    this.dimensions = dimensions;
  }

  public boolean isSmart() {
    return isSmart;
  }

  public void setSmart(boolean smart) {
    isSmart = smart;
  }

  //METODI

  @Override
  public String toString() {
    String str =
        getFullName() + " " + getDescription() + ", price: " + getFullPrice() + ", dimensions: "
            + dimensions;
    if (isSmart) {
      str += " smart";
    }

    return str;
  }
}
