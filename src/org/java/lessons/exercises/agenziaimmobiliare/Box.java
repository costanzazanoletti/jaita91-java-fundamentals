package org.java.lessons.exercises.agenziaimmobiliare;

public class Box extends Immobile {

  private int numPostiAuto;

  public Box(String codice, String indirizzo, String citta, String cap, int superficieMq,
      int numPostiAuto) {
    super(codice, indirizzo, citta, cap, superficieMq);
    this.numPostiAuto = numPostiAuto;
  }

  @Override
  public String toString() {
    return super.toString() + " - " + numPostiAuto + " posti auto";
  }
}
