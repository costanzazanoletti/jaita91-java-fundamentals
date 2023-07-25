package org.java.lessons.inheritance.streaming;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    Content firstContent = new Content("First Content");
    //firstContent.setTitle("First Content");
    firstContent.play();
    System.out.println(firstContent);

    // creo un'istanza di sottoclasse Series
    Series squidGame = new Series("Squid Game");
    // squidGame.setTitle("Squid Game");
    squidGame.setNumberOfEpisodes(10);
    squidGame.play();

    Movie dune = new Movie("Dune Part I", 300L);
    dune.play();
    System.out.println(dune);

    ArrayList<Content> playlist = new ArrayList<>();
    playlist.add(firstContent);
    playlist.add(squidGame);
    playlist.add(dune);

    System.out.println("My Playlist:");
    for (Content currentContent : playlist) {
      currentContent.play();
    }

  }
}
