package flights.pkg;

import Exceptions.SeatNotAvailableException;
import flightprototype.pkg.*;

public class Boieng extends Flight implements Flightbooking {

  public Boieng(String flightNo, int totalSeats) {
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