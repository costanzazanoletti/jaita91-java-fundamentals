package org.java.lessons.abstraction;

public abstract class Animal {

  private String name;

  public Animal(String name) {
    this.name = name;
  }

  // metodo concreto perchè ha il codice nelle {}
  public void sleep(int duration) {
    for (int i = 0; i < duration; i++) {
      System.out.print("z");
    }
    System.out.println();
  }

  public abstract void makeNoise();


  @Override
  public String toString() {
    return "Animal{" +
        "name='" + name + '\'' +
        '}';
  }


}
