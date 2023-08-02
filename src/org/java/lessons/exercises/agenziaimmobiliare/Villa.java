package org.java.lessons.exercises.agenziaimmobiliare;

public class Villa extends Abitazione {

  private int superficieGiardinoMq;

  public Villa(String codice, String indirizzo, String citta, String cap, int superficieMq,
      int numVani, int numBagni, int superficieGiardinoMq) {
    super(codice, indirizzo, citta, cap, superficieMq, numVani, numBagni);
    this.superficieGiardinoMq = superficieGiardinoMq;
  }

  // overload del metodo che reimposta le superfici
  public void reimpostaSuperficie(int nuovaSuperficieAbitazione, int nuovaSuperficieGiardino) {
    // superficieGiardinoMq è un attributo proprio di Villa e lo può modificare direttamente
    this.superficieGiardinoMq = nuovaSuperficieGiardino;
    // superficieMq è un attributo private di Immobile: non posso modificarlo direttamente
    // ma posso chiamare il metodo public che lo modifica
    reimpostaSuperficie(nuovaSuperficieAbitazione);
  }

  @Override
  public String toString() {
    return super.toString() + " - " + superficieGiardinoMq + "mq giardino";
  }
}
