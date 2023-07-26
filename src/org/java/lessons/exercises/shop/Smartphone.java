package org.java.lessons.exercises.shop;

import java.math.BigDecimal;

public class Smartphone extends Product {

  // ATTRIBUTI
  private String imeiCode;
  private int memory;

  // COSTRUTTORI
  public Smartphone(String name, String description, BigDecimal price, BigDecimal vat,
      String imeiCode, int memory) {
    // prima di tutto chiamo il costruttore della superclasse
    super(name, description, price, vat);
    // poi valorizzo i miei campi
    this.imeiCode = imeiCode;
    this.memory = memory;
  }

  // GETTER e SETTER

  public String getImeiCode() {
    return imeiCode;
  }

  public void setImeiCode(String imeiCode) {
    this.imeiCode = imeiCode;
  }

  public int getMemory() {
    return memory;
  }

  public void setMemory(int memory) {
    this.memory = memory;
  }

  // METODI


  @Override
  public String toString() {
    // concateno il toString() del Product (che mostra codice, nome, descrizione e prezzo)
    // con imei e memory che sono di Smartphone
    return super.toString() + ", imei: " + imeiCode + ", memory: " + memory + "GB";
  }
}
