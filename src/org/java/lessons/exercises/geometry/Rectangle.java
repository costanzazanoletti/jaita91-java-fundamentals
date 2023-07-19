package org.java.lessons.exercises.geometry;

// faccio in modo che se base o altezza sono <= 0 metto il valore 1 di default
public class Rectangle {

  // ATTRIBUTI
  private int base;
  private int height;

  // COSTRUTTORI (overload)
  public Rectangle(int base, int height) {
    this.base = valueOrDefault(base);
    this.height = valueOrDefault(height);
    /*if (base > 0) {
      this.base = base;
    } else {
      this.base = 1;
    }
    if (height > 0) {
      this.height = height;
    } else {
      this.height = 1;
    }*/
  }

  public Rectangle() {
    base = 1;
    height = 1;
  }

  // GETTER E SETTER

  public int getBase() {
    return base;
  }

  public void setBase(int base) {
    this.base = valueOrDefault(base);
    /*if (base > 0) {
      this.base = base;
    } else {
      this.base = 1;
    }*/
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = valueOrDefault(height);
    /*if (height > 0) {
      this.height = height;
    } else {
      this.height = 1;
    }*/
  }

  // METODI PUBLIC
  // metodo per calcolo dell'area
  public int getArea() {
    return base * height;
  }

  // metodo per calcolo del perimetro
  public int getPerimeter() {
    return 2 * base + 2 * height;
  }

  public void draw(char marker) {
    drawHorizontal(marker);
    if (height > 1) {
      // vado a capo
      System.out.println();
      // height volte -2 stampa 1 marker-spazi-marker
      for (int i = 0; i < height - 2; i++) {
        drawVertical(marker);
      }
      drawHorizontal(marker);
    }
  }

  @Override
  public String toString() {
    return "Rectangle{" +
        "base=" + base +
        ", height=" + height +
        '}';
  }

  // METODI PRIVATE
  private void drawHorizontal(char marker) {
    // stampa orizzontale base volte marker
    for (int i = 0; i < base; i++) {
      System.out.print(marker);
    }
  }

  private void drawVertical(char marker) {
    System.out.print(marker);
    for (int j = 0; j < base - 2; j++) {
      System.out.print(" ");
    }
    System.out.println(marker);
  }

  private int valueOrDefault(int value) {
    return value > 0 ? value : 1;
  }
}
