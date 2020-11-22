package com.kodilla.good.patterns.flight;

import java.time.LocalTime;
import java.util.List;

public class FlightFinderRunner {
    public static void main(String[] args) {
        Flight flight1 = new Flight("FN001", "Poznan", "Lodz", "Warszawa", LocalTime.of(10,15,00));
        Flight flight2 = new Flight("FN002", "Poznan", "Wroclaw", "Warszawa", LocalTime.of(15,15,00));
        Flight flight3 = new Flight("FN003", "Warszawa", "", "Krakow", LocalTime.of(12,40,00));
        Flight flight4 = new Flight("FN004", "Warszawa", "Lodz", "Krakow", LocalTime.of(9,10,00));
        Flight flight5 = new Flight("FN005", "Poznan", "", "Krakow", LocalTime.of(17,15,00));
        Flight flight6 = new Flight("FN006", "Gdansk", "Warszawa", "Krakow", LocalTime.of(21,50,00));
        Flight flight7 = new Flight("FN007", "Poznan", "Warszawa", "Krakow", LocalTime.of(22,10,00));
        Flight flight8 = new Flight("FN008", "Wroclaw", "Warszawa", "Rzeszow", LocalTime.of(13,05,00));
        Flight flight9 = new Flight("FN009", "Gdansk", "", "Poznan", LocalTime.of(7,30,00));

        FlightDatabase flightDatabase = new FlightDatabase();
        flightDatabase.addFlight(flight1);
        flightDatabase.addFlight(flight2);
        flightDatabase.addFlight(flight3);
        flightDatabase.addFlight(flight4);
        flightDatabase.addFlight(flight5);
        flightDatabase.addFlight(flight6);
        flightDatabase.addFlight(flight7);
        flightDatabase.addFlight(flight8);
        flightDatabase.addFlight(flight9);
        flightDatabase.addFlight(flight1);

        FlightFinder flightFinder = new FlightFinder(flightDatabase);
        List<Flight> resultDeparture = flightFinder.findFlightDeparture("Poznan");
        List<Flight> resultArrival = flightFinder.findFlightArrival("Krakow");
        List<Flight> resultTransfer = flightFinder.findFlightTransfer("Warszawa");

        System.out.println("Departure airport result\n");
        for(Flight flight : resultDeparture) {
            System.out.println(flight);
        }

        System.out.println("\n\nArrival airport result\n");
        for(Flight flight : resultArrival) {
            System.out.println(flight);
        }

        System.out.println("\n\nTransfer airport result\n");
        for(Flight flight : resultTransfer) {
            System.out.println(flight);
        }

    }
}
