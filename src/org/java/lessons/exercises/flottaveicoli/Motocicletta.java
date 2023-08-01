package org.java.lessons.exercises.flottaveicoli;

public class Motocicletta extends Veicolo {

  // ATTRIBUTI
  private boolean haCavalletto;

  // COSTRUTTORI
  public Motocicletta(String numeroTarga, int annoImmatricolazione, boolean haCavalletto) {
    super(numeroTarga, annoImmatricolazione);
    this.haCavalletto = haCavalletto;
  }

  // GETTER e SETTER

  public boolean isHaCavalletto() {
    return haCavalletto;
  }

  // METODI
  @Override
  public String toString() {
    return super.toString() +
        ", haCavalletto=" + haCavalletto;
  }
}
