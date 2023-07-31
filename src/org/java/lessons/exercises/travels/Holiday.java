package org.java.lessons.exercises.travels;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Holiday {

  // ATTRIBUTI
  private String destination;
  private LocalDate startDate;
  private LocalDate endDate;

  // COSTRUTTORI

  public Holiday(String destination, LocalDate startDate, LocalDate endDate)
      throws InvalidDateException, NullPointerException, InvalidDestinationException {
    // Validazioni
    if (destination == null || destination.isBlank()) {
      //throw new IllegalArgumentException("destination null or blank");
      throw new InvalidDestinationException("destination null or blank");
    }
    if (startDate == null) {
      throw new NullPointerException("start date null");
    }
    if (endDate == null) {
      throw new NullPointerException("end date null");
    }
    if (startDate.isBefore(LocalDate.now())) {
      throw new InvalidDateException("start date in the past");
    }
    if (endDate.isBefore(startDate)) {
      throw new InvalidDateException("end date before start date");
    }

    this.destination = destination;
    this.startDate = startDate;
    this.endDate = endDate;
  }

  // GETTER e SETTER

  public String getDestination() {
    return destination;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public LocalDate getEndDate() {
    return endDate;
  }

  // METODI
  public long getDurationInDays() {
    return ChronoUnit.DAYS.between(startDate, endDate);
  }

}
