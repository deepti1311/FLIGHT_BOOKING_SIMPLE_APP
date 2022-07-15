package flightprototype.pkg;

import Exceptions.SeatNotAvailableException;

public interface Flightbooking {
  void bookFlight(int num) throws SeatNotAvailableException;

  boolean checkSeat(int num);

}
