package com.kodilla.good.patterns.flight;

import java.util.*;

public class FlightDatabase {
    private Set<Flight> flights = new HashSet<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public Set<Flight> getFlights() {
        return flights;
    }
}