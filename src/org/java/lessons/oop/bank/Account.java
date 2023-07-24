package org.java.lessons.oop.bank;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Account {

  // ATTRIBUTI
  private int accountNumber;
  private String owner;
  private BigDecimal balance;

  // COSTRUTTORI
  public Account(int accountNumber, String owner) {
    this.balance = new BigDecimal("0.00");
    this.accountNumber = accountNumber;
    this.owner = owner;
  }
  // GETTERS e SETTERS

  public int getAccountNumber() {
    return accountNumber;
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public BigDecimal getBalance() {
    return balance;
  }

  // METODI
  // metodo per versare denaro sul conto
  // ritorna true se è riuscito a fare il versamento
  // ritorna false se non è riuscito (perchè l'importo da versare è negativo)
  public boolean deposit(BigDecimal amount) {
    // se l'importo è negativo ritorno false
    if (amount.signum() <= 0) {
      return false;
    } else {
      // altrimenti aggiungo al saldo l'importo passato
      // balance = balance + amount
      balance = balance.add(amount);
      // ritorno true
      return true;
    }

  }

  // metodo per prelevare dal conto
  // ritorna true se posso prelevare
  // ritorna false se non ci sono abbastanza soldi sul conto o se l'importo è negativo
  public boolean withdraw(BigDecimal amount) {
    // se l'importo è negativo ritorno false
    // se l'importo è maggiore del saldo ritorno false
    if (amount.signum() <= 0 || amount.compareTo(balance) > 0) {
      return false;
    } else {
      // altrimenti sottraggo l'importo al saldo
      // balance = balance - amout
      balance = balance.subtract(amount);
      // ritorno true
      return true;
    }
  }

  @Override
  public String toString() {
    return "Account{" +
        "accountNumber=" + accountNumber +
        ", owner='" + owner + '\'' +
        ", balance=" + balance.setScale(2, RoundingMode.HALF_EVEN) + " €" +
        '}';
  }
}
