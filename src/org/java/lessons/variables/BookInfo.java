package org.java.lessons.variables;

public class BookInfo {

  public static void main(String[] args) {
    // dichiaro quali variabili rappresentano le caratteristiche del libro
    String coverImage;
    String title;
    String author;
    long isbn;
    // tipi di libro
    boolean isFlexibleCover;
    boolean isKindle;
    // campi della data pubblicazione
    int dayOfPublishing;
    int monthOfPublishing;
    int yearOfPublishing;
    // campi per il rating
    int numberOfRatings;
    float avgRating;

    // assegno un valore alle variabili
    coverImage = "https://m.media-amazon.com/images/I/41xShlnTZTL._SY445_SX342_.jpg";
    title = "Clean Code: A Handbook of Agile Software Craftsmanship";
    author = "Robert C. Martin";
    isbn = 9780132350884L;
    isFlexibleCover = true;
    isKindle = true;
    dayOfPublishing = 1;
    monthOfPublishing = 8;
    yearOfPublishing = 2008;
    numberOfRatings = 5559;
    avgRating = 4.7F;

    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("ISBN: " + isbn);
    System.out.println("is flexible cover: " + isFlexibleCover);
    System.out.println("is Kindle: " + isKindle);
    System.out.println("Cover image url: " + coverImage);
    // dichiaro e inizializzo una variabile String che contiene la data
    // giorno/mese/anno
    String dateOfPublishing = dayOfPublishing + "/" + monthOfPublishing + "/" + yearOfPublishing;
    System.out.println("Date of publishing: " + dateOfPublishing);
    // dichiaro e inizializzo una variabile String con le informazioni di rating
    //String ratingInfo = avgRating + " over " + numberOfRatings + " ratings";
    System.out.println(avgRating + " over " + numberOfRatings + " ratings");

  }
}
