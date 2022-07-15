package flights.pkg;

import Exceptions.SeatNotAvailableException;
import flightprototype.pkg.*;

public class Airbus extends Flight implements Flightbooking {

  public Airbus(String flightNo, int totalSeats) {
    super(flightNo, totalSeats);
  }

  @Override
  public void bookFlight(int num) throws SeatNotAvailableException {
    super.bookFlight(num);

  }

  @Override
  public boolean checkSeat(int num) {
    return super.checkSeat(num);
  }
}