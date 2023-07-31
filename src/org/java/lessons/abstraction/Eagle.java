package org.java.lessons.abstraction;

public class Eagle extends Animal {

  public Eagle(String name) {
    super(name);
  }


  @Override
  public void makeNoise() {
    System.out.println("Screeech");
  }
}
