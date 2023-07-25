package org.java.lessons.inheritance.streaming;

public class Movie extends Content {

  // ATTRIBUTI
  private long duration;

  // COSTRUTTORI
  public Movie(String title, long duration) {
    // prima costruisco il Content che sta dentro al Movie
    super(title);

    // poi faccio gli assegnamenti solo di Movie
    this.duration = duration;
  }

  @Override
  public String toString() {
    return "Movie{title: " + getTitle() + ", duration: " + duration + "minutes }";
  }
}
