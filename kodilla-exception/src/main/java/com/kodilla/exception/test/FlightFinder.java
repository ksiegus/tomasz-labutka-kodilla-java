package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightFinder {
    private List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }
    public boolean findFlight(String arrivalAirport) throws RouteNotFoundException {
        Map<String, Boolean> arrivalAirportMap = new HashMap<>();
        for (Flight flight : flights) {
            arrivalAirportMap.put(flight.getArrivalAirport(), true);
        }

        if (arrivalAirportMap.containsKey(arrivalAirport)) {
            return true;
        }
        throw new RouteNotFoundException();
    }


}
