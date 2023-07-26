package org.java.lessons.exercises.shop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Cart {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // mi preparo una lista di prodotti
    ArrayList<Product> products = new ArrayList<>();
    boolean exit = false;

    while (!exit) {
      // chiedo all'utente se vuole inserire un nuovo prodotto o se vuole terminare
      System.out.print("1-Insert new product 2-Exit ");
      String choice = scan.nextLine();
      switch (choice) {
        case "1":
          System.out.println("Insert new product");
          // se vuole inserire un prodotto gli chiedo quale tipo (Smartphone, HeadSet o Television)
          String productType;
          do {
            System.out.print("Which product? S-Smartphone H-HeadSet T-Television");
            productType = scan.nextLine();
          } while (!productType.equalsIgnoreCase("S") && !productType.equalsIgnoreCase("H")
              && !productType.equalsIgnoreCase("T"));
          System.out.println("You choose " + productType);
          // mi faccio dare tutte le info per creare quel tipo di prodotto
          // info comuni a tutti i prodotti
          System.out.print("Name: ");
          String name = scan.nextLine();
          System.out.print("Description: ");
          String description = scan.nextLine();
          System.out.print("Price: ");
          BigDecimal price = new BigDecimal(scan.nextLine());
          System.out.print("Vat: ");
          BigDecimal vat = new BigDecimal(scan.nextLine());
          // info speficiche per ogni sottotipo di Product
          switch (productType.toUpperCase()) {
            case "S":
              // Smartphone
              System.out.print("IMEI: ");
              String imeiCode = scan.nextLine();
              System.out.print("Memory: ");
              int memory = Integer.parseInt(scan.nextLine());
              // costruisco un oggetto di quel tipo
              Smartphone smartphone = new Smartphone(name, description, price, vat, imeiCode,
                  memory);
              // aggiungo l'oggetto alla lista
              products.add(smartphone);
              break;
            case "T":
              // Television
              System.out.print("Dimensions: ");
              int dimensions = Integer.parseInt(scan.nextLine());
              System.out.print("Smart?(y/n)");
              String isSmartString = scan.nextLine();
              boolean isSmart = isSmartString.equalsIgnoreCase("y");
              // costruisco un oggetto di quel tipo
              Television television = new Television(name, description, price, vat, dimensions,
                  isSmart);
              // aggiungo l'oggetto alla lista
              products.add(television);
              break;
            case "H":
              // HeadSet
              System.out.print("Color: ");
              String color = scan.nextLine();
              System.out.print("Wireless?(y/n)");
              String isWirelessString = scan.nextLine();
              boolean isWireless = isWirelessString.equalsIgnoreCase("y");
              // costruisco un oggetto di quel tipo
              HeadSet headSet = new HeadSet(name, description, price, vat, color, isWireless);
              // aggiungo l'oggetto alla lista
              products.add(headSet);
              break;
            default:
              break;
          }

          break;
        case "2":
          // se vuole terminare esco
          System.out.println("Exit");
          exit = true;
          break;
        default:
          System.out.println("Invalid choice");
          break;
      }
    }

    // stampo la lista
    BigDecimal total = new BigDecimal("0");
    System.out.println("Your cart contains:");
    for (Product product : products) {
      System.out.println(product);
      total = total.add(product.getFullPrice());

    }
    // stampo il totale
    System.out.println("Total: " + total);
    scan.close();
  }
}
