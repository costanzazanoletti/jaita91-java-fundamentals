package org.java.lessons.oop.cars;

public class Main {

  public static void main(String[] args) {
    // costruisco un nuovo oggetto di tipo Car e lo salvo in una variabile
    Car yaris = new Car();
    // stampo tutti i valori degli attributi di quell'oggetto (= lo stato attuale)
    System.out.println("YARIS CAR");
    System.out.println("Brand " + yaris.brand);
    System.out.println("Model " + yaris.model);
    System.out.println("Color " + yaris.color);
    System.out.println("Year " + yaris.year);
    // modifico il valore degli attributi
    yaris.brand = "Toyota";
    yaris.model = "Yaris";
    yaris.color = "white";
    yaris.year = 2020;
    // stampo tutti i valori degli attributi di quell'oggetto (= lo stato attuale)
    System.out.println("Brand " + yaris.brand);
    System.out.println("Model " + yaris.model);
    System.out.println("Color " + yaris.color);
    System.out.println("Year " + yaris.year);

    // ne costruisco un altro
    Car pippo = new Car();
    pippo.setBrandModel("Audi", "A3");
    String pippoString = pippo.toString();

    System.out.println(pippoString);
    System.out.println(pippo);

    // costruisco un'altra auto
    Car lambo = new Car("Lamborghini", "Model1", "Blue", 2022);
    lambo.setBrandModel("Lamborghini", "Model2");
    System.out.println(lambo);

  }
}
