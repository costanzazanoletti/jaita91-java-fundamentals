package org.java.lessons.exercises.agenziaimmobiliare;

import java.util.ArrayList;
import java.util.List;

public class AgenziaImmobiliare {

  // ATTRIBUTI
  private List<Immobile> listImmobili;

  // COSTRUTTORE
  public AgenziaImmobiliare() {
    listImmobili = new ArrayList<>();
  }

  // METODI
  // metodo per aggiungere un immobile
  public void aggiungiImmobile(Immobile nuovoImmobile) {
    listImmobili.add(nuovoImmobile);
  }

  // un metodo per la ricerca di un immobile a partire dal codice alfanumerico
  public Immobile cercaImmobilePerCodice(String codice) {
    for (Immobile i : listImmobili) {
      if (i.getCodice().equals(codice)) {
        return i;
      }
    }
    // se termino il ciclo senza avere ritornato l'immobile ritorno null
    return null;
  }

  // un metodo per restituire l’immobile che ha avuto il maggior numero di persone interessate
  public Immobile immobileMaxPersoneInteressate() {
    // itero su tutti gli immobili e guardo il numeroPersoneInteressate
    // fuori dal ciclo tengo in una variabile qual'è il massimo trovato finora
    int max = -1;
    Immobile maxImmobile = null;
    for (Immobile i : listImmobili) {
      int numPersoneInteressate = i.getNumPersoneInteressate();
      if (numPersoneInteressate > max) {
        max = numPersoneInteressate;
        maxImmobile = i;
      }
    }
    return maxImmobile;
  }
}
