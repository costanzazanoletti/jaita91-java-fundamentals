package org.java.lessons.collections;

import java.util.ArrayList;

public class Examples {

  public static void main(String[] args) {

    int[] numberArray = new int[10];
    ArrayList<Integer> numberList = new ArrayList<>();
    Integer i = 8;
    int x = 10;
    numberList.add(5);
    numberList.add(18);
    numberList.add(i);
    numberList.add(x);
    System.out.println(numberList);
    // iterare su una ArrayList
    // for-i
    for (int j = 0; j < numberList.size(); j++) {
      System.out.println(j);
      int current = numberList.get(j); // come per un array numberArray[j]
      System.out.println(current);
    }

    // for-in
    // calcolo la somma
    int sum = 0;
    for (int number : numberList) { // number = ...
      sum += number;
    }

    System.out.println("Sum: " + sum);
    ArrayList<Double> doubleList = new ArrayList<>();
    doubleList.add((double) 9);
  }
}
