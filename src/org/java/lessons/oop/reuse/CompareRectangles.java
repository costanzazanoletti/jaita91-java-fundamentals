package org.java.lessons.oop.reuse;

import java.util.Arrays;
import java.util.Random;
import org.java.lessons.exercises.geometry.Rectangle;

/*
Creare un array di 10 rettangoli di dimensioni random (1-100).
Calcolare qual’è il più grande.
*/
public class CompareRectangles {

  public static void main(String[] args) {
    // Istanzio un random generator
    Random randomGenerator = new Random();
    // Creare un array di 10 rettangoli
    Rectangle[] rectangles = new Rectangle[10];
    System.out.println(Arrays.toString(rectangles));

    // itero su tutte le posizioni dell'array
    for (int i = 0; i < rectangles.length; i++) {
      // calcolo base e altezza random
      int base = randomGenerator.nextInt(1, 101);
      int height = randomGenerator.nextInt(1, 101);
      // creo un nuovo Rectangle con quella base e altezza
      Rectangle r = new Rectangle(base, height);
      // alla posizione corrente inserisco il Rectangle
      rectangles[i] = r;
    }
    System.out.println(Arrays.toString(rectangles));
    // [1,55,76,3,80,2]
    // più grande fin qui 55
    // dichiaro una variabile che tiene in memoria il più grande fin qui
    int maxSoFar = -1; // di default gli do un valore più piccolo di tutti quelli che posso avere nell'array
    int indexOfMax = -1;
    // itero su tutte le posizioni dell'array
    for (int i = 0; i < rectangles.length; i++) {
      // confronto l'area del rettangolo corrente con il massimo fin qui
      int areaCurr = rectangles[i].getArea();
      if (areaCurr > maxSoFar) {
        // se l'area corrente è più grande di maxSoFar lo sostituisco
        maxSoFar = areaCurr;
        // salvo anche l'indice dell'array
        indexOfMax = i;
      }
    }
    System.out.println(
        "The biggest rectangle is " + rectangles[indexOfMax] + " with area " + maxSoFar);
  }
}
