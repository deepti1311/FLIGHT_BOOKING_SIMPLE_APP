package flightprototype.pkg;

import java.util.ArrayList;

import Exceptions.SeatNotAvailableException;

public abstract class Flight implements Flightbooking {

  public String flightNo;
  public int totalSeats;
  public ArrayList<Integer> availableSeats = new ArrayList<Integer>();
  public ArrayList<Integer> bookedSeats = new ArrayList<Integer>();
  private int seatno;

  public Flight(String flightNo, int totalSeats) {
    this.flightNo = flightNo;
    this.totalSeats = totalSeats;

    for (int seatno = 1; seatno <= totalSeats; seatno++) {

      this.availableSeats.add(seatno);
      this.bookedSeats.add(seatno);

    }

  }

  @Override
  public void bookFlight(int seatno) throws SeatNotAvailableException {
    System.out.println(getClass().getSimpleName() + " Filght Booking Details:");
    System.out.println("Filght Number:" + this.flightNo);
    System.out.println("Total Number of Seats:" + this.totalSeats);
    System.out.println("Number of seats available for booking:" + this.availableSeats);

    try {

      if (checkSeat(seatno)) {
        this.availableSeats.remove(this.availableSeats.indexOf(seatno));
        this.bookedSeats.set((seatno - 1), 0);
        System.out.println(getClass().getSimpleName() + " Flight seat number: " + seatno);
        System.out.println("SEAT BOOKED SUCCESFULLY!!!");
        System.out.println("Thank you for travelling with " + getClass().getSimpleName() + " Airline!!\n");
      } else {
        throw new SeatNotAvailableException(
            "seat No. " + seatno + "  is unavailable FOR BOOKING, " + getClass().getSimpleName() + " Airline!!\n");
      }
    } catch (SeatNotAvailableException e) {
      e.getMessage();
      throw new SeatNotAvailableException(
          "seat No. " + seatno + "  is unavailable FOR BOOKING, " + getClass().getSimpleName() + " Airline!!\n");
    }
  }

  @Override
  public boolean checkSeat(int seatno) {
    for (int seat : this.availableSeats) {
      if (seat == seatno) {
        return true;
      }
    }
    return false;
  }

}
