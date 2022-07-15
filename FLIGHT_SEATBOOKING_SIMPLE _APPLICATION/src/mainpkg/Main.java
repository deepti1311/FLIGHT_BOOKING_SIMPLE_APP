package mainpkg;

import Exceptions.SeatNotAvailableException;
import flightprototype.pkg.*;
import flights.pkg.*;

public class Main {
  public static void main(String[] args) throws Exception {
    System.out.println("\n");

    Boieng B1 = new Boieng("A123", 5);
    Airbus A1 = new Airbus("R45", 10);

    try {
      B1.bookFlight(1);
    } catch (SeatNotAvailableException e) {
      System.out.println(e.getMessage());
    }
    try {
      A1.bookFlight(7);
    } catch (SeatNotAvailableException e) {
      e.getMessage();
    }

    System.out.println("\n");

  }
}


