package org.java.lessons.abstraction;

public class Cat extends Animal {

  public Cat(String name) {
    super(name);
  }

  public void play(String toy) {
    System.out.println("I'm playing with " + toy);
  }

  @Override
  public void makeNoise() {
    System.out.println("Meow");
  }
}
