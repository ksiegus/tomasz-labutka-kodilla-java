package com.kodilla.good.patterns.flight;

import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {
    private FlightDatabase flightDatabase;

    public FlightFinder(FlightDatabase flightDatabase) {
        this.flightDatabase = flightDatabase;
    }

    public List<Flight> findFlightDeparture(String airport) {
        return this.flightDatabase.getFlights().stream().filter(t -> t.getDepartureAirport() == airport).collect(Collectors.toList());
    }
    public List<Flight> findFlightArrival(String airport) {
        return this.flightDatabase.getFlights().stream().filter(t -> t.getArrivalAirport() == airport).collect(Collectors.toList());
    }
    public List<Flight> findFlightTransfer(String airport) {
        return this.flightDatabase.getFlights().stream().filter(t -> t.getTransferAirport() == airport).collect(Collectors.toList());
    }
    public boolean isFlightExist(String departureAirport, String arrivalAirport) {
        List<Flight> flightList = this.flightDatabase.getFlights().stream().filter(t -> t.getDepartureAirport() == departureAirport).collect(Collectors.toList());
        for(Flight flight :flightList) {
            if (flight.getArrivalAirport() == arrivalAirport) {
                return true;
            }
            else {
                System.out.println(flight.getArrivalAirport());
                System.out.println(arrivalAirport);
                return isFlightExist(flight.getArrivalAirport(), arrivalAirport);
            }

        }
        return false;
    }
}
