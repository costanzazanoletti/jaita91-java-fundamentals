package org.java.lessons.abstraction;

public class Sparrow extends Animal implements CanFly {

  public Sparrow(String name) {
    super(name);
  }

  // override del metodo astratto della superclasse Animal
  @Override
  public void makeNoise() {
    System.out.println("Cip cip");
  }

  // override di tutti i metodi dell'interfaccia CanFly
  @Override
  public void flyUp(int pixel) {
    System.out.println("I'm a sparrow and I fly up " + pixel);
  }

  @Override
  public void flyDown(int pixel) {
    System.out.println("I'm a sparrow and I fly down " + pixel);
  }

  @Override
  public void flyRight(int pixel) {
    System.out.println("I'm a sparrow and I fly right " + pixel);
  }

  @Override
  public void flyLeft(int pixel) {
    System.out.println("I'm a sparrow and I fly left " + pixel);
  }

  @Override
  public void land() {
    System.out.println("I'm a sparrow and I land");
    makeNoise();
  }
}
