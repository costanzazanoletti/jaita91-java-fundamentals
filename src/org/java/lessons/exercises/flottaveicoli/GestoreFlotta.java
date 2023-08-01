package org.java.lessons.exercises.flottaveicoli;

import java.util.ArrayList;
import java.util.List;

public class GestoreFlotta {

  // ATTRIBUTI
  private List<Veicolo> listaVeicoli;

  // COSTRUTTORI

  public GestoreFlotta() {
    // inizializzo la lista di veicoli come una lista vuota che è meglio di null
    listaVeicoli = new ArrayList<>();
  }

  // GETTER E SETTER

  // METODI
  // aggiungere nuovi veicoli alla flotta
  public void aggiungiVeicolo(Veicolo veicolo) {
    // prendo la targa del veicolo da aggiungere
    String targa = veicolo.getNumeroTarga();
    if (trovaVeicoloPerTarga(targa) != null) {
      // ho già in lista un veicolo con quella targa
      throw new IllegalArgumentException("veicolo con targa " + targa + "presente in lista");
    }
    listaVeicoli.add(veicolo);
  }

  // contare quanti veicoli ci sono di un determinato tipo (automobile o motocicletta)
  public int contaVeicoliPerTipo(String tipo) throws IllegalArgumentException {
    // controllo che il tipo sia valido
    if (!tipo.equals("automobile") && !tipo.equals("motocicletta")) {
      throw new IllegalArgumentException("tipo non valido " + tipo);
    }
    int count = 0;
    // itero su tutti i veicoli
    for (Veicolo veicolo : listaVeicoli) {
      switch (tipo) {
        case "automobile":
          // conto le automobili
          if (veicolo instanceof Automobile) {
            count++;
          }
          break;
        case "motocicletta":
          // conto le motociclette
          if (veicolo instanceof Motocicletta) {
            count++;
          }
          break;
        default:
          break;
      }
    }
    return count;
  }

  // trovare un veicolo specifico tramite il numero di targa
  public Veicolo trovaVeicoloPerTarga(String numeroTarga) {
    boolean trovato = false;
    int contatore = 0;
    Veicolo veicoloCercato = null;
    while (!trovato && contatore < listaVeicoli.size()) {
      // per ogni veicolo nella lista confronto il numero di targa con quello passato
      if (numeroTarga.equals(listaVeicoli.get(contatore).getNumeroTarga())) {
        // trovato!
        veicoloCercato = listaVeicoli.get(contatore);
        trovato = true;
      }
      contatore++;
    }
    return veicoloCercato;
  }
}
