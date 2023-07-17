package org.java.lessons.snacks;

import java.util.Random;

public class RandomNumbers {

  public static void main(String[] args) {
    // creo un oggetto di tipo Random
    Random randomGenerator = new Random();

    int randomNumber = randomGenerator.nextInt(1, 11); // compreso tra 1 (incluso) e 11 (escluso)

    System.out.println(randomNumber);
  }
}
