package org.java.lessons.oop.salary;

import java.util.Scanner;

/*
 * In una classe Main chiedere all’utente di inserire i dati dell’impiegato
 * e mostrare a quanto ammonta il suo salario attuale
 * */
public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Employee data");
    // per costruire un oggetto Employee mi servono
    // firstName
    System.out.print("First name: ");
    String firstNameInput = scan.nextLine();
    // lastName
    System.out.print("Last name: ");
    String lastNameInput = scan.nextLine();
    // years
    System.out.print("Years: ");
    int yearsInput = Integer.parseInt(scan.nextLine());
    // baseSalary
    System.out.print("Base salary: ");
    double baseSalaryInput = Double.parseDouble(scan.nextLine());

    // con queste informazioni creo un oggetto Employee
    Employee employee = new Employee(firstNameInput, lastNameInput, yearsInput, baseSalaryInput);
    // chiedo all'Employee di calcolare il salario attuale
    System.out.println(
        "Actual salary of employee " + employee.getFullName() + ": " + employee.getActualSalary());

    // chiudo lo scanner
    scan.close();
  }
}
