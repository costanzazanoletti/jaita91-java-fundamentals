package org.java.lessons.exercises.shop;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // chiediamo all'utente di inserire un prodotto
    System.out.println("INSERT NEW PRODUCT");
    // name
    System.out.print("Name: ");
    String nameInput = scanner.nextLine();
    // description
    System.out.print("Description: ");
    String descriptionInput = scanner.nextLine();
    // price
    System.out.print("Price: ");
    String priceStringInput = scanner.nextLine();
    BigDecimal priceInput = new BigDecimal(priceStringInput);
    // vat
    System.out.print("Vat: ");
    String vatStringInput = scanner.nextLine();
    BigDecimal vatInput = new BigDecimal(vatStringInput);

    // creo il prodotto
    Product product = new Product(nameInput, descriptionInput, priceInput, vatInput);

    HashSet<Category> categories = new HashSet<>();
    categories.add(new Category("offer", "product in special offer"));
    categories.add(new Category("edible", "edible product"));
    product.setCategories(categories);

    // del prodotto mostriamo il nome completo e il prezzo completo
    System.out.println("Generated product: " + product.getFullName());
    System.out.println("Full price: " + product.getFullPrice() + "€");
    // stampo tutte le categorie
    for (Category c : product.getCategories()) {
      System.out.println(c.getName() + ": " + c.getDescription());
    }

    scanner.close();
  }
}
