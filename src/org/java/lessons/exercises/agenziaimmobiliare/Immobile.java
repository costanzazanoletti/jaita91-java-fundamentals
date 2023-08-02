package org.java.lessons.exercises.agenziaimmobiliare;

public class Immobile {

  // ATTRIBUTI
  private String codice;
  private String indirizzo;
  private String citta;
  private String cap;
  private int superficieMq;
  private int numPersoneInteressate;

  // COSTRUTTORI

  public Immobile(String codice, String indirizzo, String citta, String cap, int superficieMq) {
    this.codice = codice;
    this.indirizzo = indirizzo;
    this.citta = citta;
    this.cap = cap;
    this.superficieMq = superficieMq;
    // valore iniziale è 0 perchè nessuno ha ancora visualizzato l'immobile
    this.numPersoneInteressate = 0;
  }
  // GETTER


  public String getCodice() {
    return codice;
  }

  public int getNumPersoneInteressate() {
    return numPersoneInteressate;
  }

  // METODI
  // metodo che incrementa il contatore di persone interessate
  public void incrementaNumPersoneInteressate() {
    numPersoneInteressate++;
  }

  // metodo per reimpostare la superficie
  public void reimpostaSuperficie(int nuovaSuperficie) {
    this.superficieMq = nuovaSuperficie;
  }

  @Override
  public String toString() {
    return codice + " - " + indirizzo + " " + citta + " " + cap + " - " + superficieMq + "mq";
  }
}
