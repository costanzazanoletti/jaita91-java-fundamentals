package org.java.lessons.exercises.shop;

import java.math.BigDecimal;

public class InheritanceTest {

  public static void main(String[] args) {
    Smartphone s = new Smartphone("iPhone", "Apple", new BigDecimal("799.99"),
        new BigDecimal("0.22"), "1234567897897", 64);
    System.out.println(s.getFullName());
    System.out.println(s.getFullPrice());
    System.out.println(s);

  }
}
