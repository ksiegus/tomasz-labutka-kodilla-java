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
}
