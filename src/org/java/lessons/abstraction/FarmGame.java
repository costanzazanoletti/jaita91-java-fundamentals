package org.java.lessons.abstraction;

import java.util.LinkedList;
import java.util.List;

public class FarmGame {

  public static void main(String[] args) {
    // Animal animal = new Animal("gino"); NON SI PUO' FARE
    Cow cow = new Cow("Jane");
    System.out.println(cow.toString());
    cow.sleep(30);
    cow.makeNoise();

    Cat cat = new Cat("Tom");
    System.out.println(cat.toString());
    cat.sleep(10);
    cat.makeNoise();
    cat.play("mouse");

    List<Animal> animals = new LinkedList<>();
    animals.add(cow);
    animals.add(cat);
    System.out.println("ANIMALS");
    for (Animal animal : animals) {
      animal.makeNoise();
      // come faccio a capire se è Cat o Cow
      if (animal instanceof Cow) {
        System.out.println("Cow");
      }
      if (animal instanceof Cat) {
        System.out.println("Cat");
      }
    }
  }
}
