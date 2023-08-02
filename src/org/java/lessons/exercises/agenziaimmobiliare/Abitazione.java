package org.java.lessons.exercises.agenziaimmobiliare;

public class Abitazione extends Immobile {

  private int numVani;
  private int numBagni;

  public Abitazione(String codice, String indirizzo, String citta, String cap, int superficieMq,
      int numVani, int numBagni) {
    super(codice, indirizzo, citta, cap, superficieMq);
    this.numVani = numVani;
    this.numBagni = numBagni;
  }

  @Override
  public String toString() {
    return super.toString() + " - " + numVani + " vani" + " - " + numBagni + " bagni";
  }
}
