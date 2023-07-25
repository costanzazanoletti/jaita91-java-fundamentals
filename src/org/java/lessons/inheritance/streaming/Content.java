package org.java.lessons.inheritance.streaming;

public class Content {

  // ATTRIBUTI
  private String title;

  // COSTRUTTORI
  public Content(String title) {

    this.title = title;
  }

  // GETTER E SETTER

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  // METODI
  public void play() {
    System.out.println("Playing...." + title);
  }

  @Override
  public String toString() {
    // creo una stringa che rappresenta l'oggetto Content
    return "Content{title: " + title + "}";
  }
}
