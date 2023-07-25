package org.java.lessons.inheritance.streaming;

public class Series extends Content {

  // ATTRIBUTI
  private int numberOfEpisodes;

  // COSTRUTTORI
  public Series(String title) {
    super(title); // new Content(title)
  }

  // GETTER E SETTER

  public int getNumberOfEpisodes() {
    return numberOfEpisodes;
  }

  public void setNumberOfEpisodes(int numberOfEpisodes) {
    this.numberOfEpisodes = numberOfEpisodes;
  }

  // METODI
  public void addEpisode() {
    numberOfEpisodes++;
  }

  @Override // ANNOTATION
  public void play() {
    // voglio modificare il metodo play:
    // - stampo il titolo della serie
    // per tante volte quanti sono gli episodi stampo "Playing... episode n"
    System.out.println("Title: " + getTitle());
    for (int i = 0; i < numberOfEpisodes; i++) {
      System.out.println("Playing...Episode " + (i + 1));
    }

  }
}
