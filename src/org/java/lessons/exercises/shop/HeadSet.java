package org.java.lessons.exercises.shop;

import java.math.BigDecimal;

public class HeadSet extends Product {

  // ATTRIBUTI
  private String color;
  private boolean wireless;

  // COSTRUTTORI
  public HeadSet(String name, String description, BigDecimal price,
      BigDecimal vat, String color, boolean wireless) {
    // passiamo i parametri al costruttore di Produce
    super(name, description, price, vat);
    // valorizziamo gli attributi di HeadSet
    this.color = color;
    this.wireless = wireless;
  }

  // GETTER E SETTER

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean isWireless() {
    return wireless;
  }

  public void setWireless(boolean wireless) {
    this.wireless = wireless;
  }

  @Override
  public String toString() {
    String str = super.toString() + ", color: " + color;
    if (wireless) {
      str += " wireless";
    } else {
      str += " cabled";
    }
    return str;
  }
}
