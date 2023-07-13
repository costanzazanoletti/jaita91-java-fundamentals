package org.java.lessons.array;

import java.util.Arrays;
import java.util.Scanner;

public class WeekDays {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // String[] weekDays = {"MON", "TUE", "WEN", "THU", "FRI", "SAT", "SUN"};

    // creo un array vuoto di 7 elementi
    String[] weekDays;

    weekDays = new String[7];
    // stampo l'array vuoto
    System.out.println(Arrays.toString(weekDays));

    System.out.print("First day: ");
    weekDays[0] = scan.nextLine();
    System.out.print("Second day: ");
    weekDays[1] = scan.nextLine();
    System.out.print("Third day: ");
    weekDays[2] = scan.nextLine();
    System.out.print("Fourth day: ");
    weekDays[3] = scan.nextLine();
    System.out.print("Fifth day: ");
    weekDays[4] = scan.nextLine();
    System.out.print("Sixth day: ");
    weekDays[5] = scan.nextLine();
    System.out.print("Seventh day: ");
    weekDays[6] = scan.nextLine();

    // stampo l'array pieno
    System.out.println(Arrays.toString(weekDays));

    System.out.println("Lunghezza: " + weekDays.length);
    // prendo il primo elemento
    String firstDay = weekDays[0];
    // prendo l'ultimo elemento
    String lastDay = weekDays[weekDays.length - 1];

    System.out.println("First day: " + firstDay);
    System.out.println("Last day: " + lastDay);

    // uso il ciclo for per stampare tutti gli elementi dall'ultimo al primo
    for (int i = weekDays.length - 1; i >= 0; i--) {
      System.out.println(i + " " + weekDays[i]);
    }

    scan.close();
  }
}
