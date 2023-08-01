package org.java.lessons.exercises.flottaveicoli;

public abstract class Veicolo {

  // ATTRIBUTI
  private String numeroTarga;
  private int annoImmatricolazione;
  // COSTRUTTORI

  public Veicolo(String numeroTarga, int annoImmatricolazione) {
    this.numeroTarga = numeroTarga;
    this.annoImmatricolazione = annoImmatricolazione;
  }

  // GETTER e SETTER

  public String getNumeroTarga() {
    return numeroTarga;
  }

  public int getAnnoImmatricolazione() {
    return annoImmatricolazione;
  }

  // METODI

  @Override
  public String toString() {
    return "numeroTarga='" + numeroTarga + '\'' +
        ", annoImmatricolazione=" + annoImmatricolazione;
  }
}
