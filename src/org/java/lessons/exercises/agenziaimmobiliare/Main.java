package org.java.lessons.exercises.agenziaimmobiliare;

public class Main {

  public static void main(String[] args) {
    Immobile immobile = new Immobile("XYZ", "viale dei Ciliegi 17", "Londra", "12345", 250);
    System.out.println(immobile.toString() + " (" + immobile.getNumPersoneInteressate() + ")");

    Box box = new Box("ABC", "via Nuova 11", "Milano", "20100", 20, 2);
    System.out.println(box + " (" + immobile.getNumPersoneInteressate() + ")");

    Abitazione abitazione = new Abitazione("QWE", "piazza Risorgimento 1", "Matera", "19802", 125,
        5, 2);
    System.out.println(abitazione);

    Villa villa = new Villa("123", "via Lago 100", "Como", "24500", 500, 20, 8, 1000);
    System.out.println(villa);

    villa.reimpostaSuperficie(600, 1200);
  }
}
