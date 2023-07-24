package org.java.lessons.exercises.shop;

public class Category {

  // ATTRIBUTI
  private String name;
  private String description;

  // COSTRUTTORI
  public Category(String name, String description) {
    this.name = name;
    this.description = description;
  }

  // GETTER e SETTER
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
