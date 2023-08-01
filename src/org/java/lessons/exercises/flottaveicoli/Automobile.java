package org.java.lessons.exercises.flottaveicoli;

public class Automobile extends Veicolo {

  // ATTRIBUTI
  private int numeroPorte;

  // COSTRUTTORI
  public Automobile(String numeroTarga, int annoImmatricolazione, int numeroPorte) {
    // invoco il costruttore con parametri della superclasse Veicolo
    super(numeroTarga, annoImmatricolazione);
    // assegno valore agli attributi propri di Automobile
    this.numeroPorte = numeroPorte;
  }

  // GETTER e SETTER

  public int getNumeroPorte() {
    return numeroPorte;
  }

  // METODI

  @Override
  public String toString() {
    return "numeroTarga='" + getNumeroTarga() + '\'' +
        ", annoImmatricolazione=" + getAnnoImmatricolazione() + ", numeroPorte=" + numeroPorte;
  }
}
