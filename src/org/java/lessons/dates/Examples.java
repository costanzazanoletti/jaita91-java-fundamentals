package org.java.lessons.dates;

import java.time.LocalDate;

public class Examples {

  public static void main(String[] args) {
    LocalDate today = LocalDate.now();
    System.out.println(today);
    LocalDate tomorrow = LocalDate.now().plusDays(1);
    System.out.println(tomorrow);

    LocalDate dob = LocalDate.of(1995, 1, 3);
    System.out.println(dob);
    LocalDate dob2 = LocalDate.parse("1995-01-03");
    System.out.println(dob2);

    boolean dobInThePast = dob.isBefore(LocalDate.now());
  }
}
