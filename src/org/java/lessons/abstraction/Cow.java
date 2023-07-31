package org.java.lessons.abstraction;

public class Cow extends Animal {

  public Cow(String name) {
    super(name);
  }

  public void makeMilk() {
    System.out.println("I'm making milk");
  }

  @Override
  public void makeNoise() {
    System.out.println("Mooooh");
  }
}
