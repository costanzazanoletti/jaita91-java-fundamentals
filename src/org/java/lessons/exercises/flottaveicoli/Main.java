package org.java.lessons.exercises.flottaveicoli;

public class Main {

  public static void main(String[] args) {
    Automobile a1 = new Automobile("ABC123XY", 2000, 5);
    Automobile a2 = new Automobile("DEF456KW", 2023, 4);
    Automobile a3 = new Automobile("GHI789PQ", 2019, 7);

    Motocicletta m1 = new Motocicletta("LOP345IY", 2018, true);
    Motocicletta m2 = new Motocicletta("ACV754TY", 2020, false);
    Motocicletta m3 = new Motocicletta("JGH000WQ", 2020, true);

    // creo il gestore flotta
    GestoreFlotta gestoreFlotta = new GestoreFlotta();
    // testo il metodo aggiungiVeicolo
    gestoreFlotta.aggiungiVeicolo(a1);
    gestoreFlotta.aggiungiVeicolo(a2);
    gestoreFlotta.aggiungiVeicolo(a3);
    gestoreFlotta.aggiungiVeicolo(m1);
    gestoreFlotta.aggiungiVeicolo(m2);

    // testo il metodo contaVeicoliPerTipo
    System.out.println("automobili: " + gestoreFlotta.contaVeicoliPerTipo("automobile")); // 3
    System.out.println("motociclette: " + gestoreFlotta.contaVeicoliPerTipo("motocicletta")); // 2
    try {
      System.out.println("furgoni: " + gestoreFlotta.contaVeicoliPerTipo("furgoni"));
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
    // testo il metodo trovaVeicoliPerTarga
    System.out.println(gestoreFlotta.trovaVeicoloPerTarga("JGH000WQ")); // null
    System.out.println(gestoreFlotta.trovaVeicoloPerTarga("GHI789PQ")); // a3
    System.out.println(gestoreFlotta.trovaVeicoloPerTarga("ACV754TY")); // m2


  }
}
