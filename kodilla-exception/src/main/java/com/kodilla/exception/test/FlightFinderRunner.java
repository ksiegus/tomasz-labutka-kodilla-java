package com.kodilla.exception.test;

import com.kodilla.exception.nullpointer.MessageNotSentException;

public class FlightFinderRunner {
    public static void main(String[] args) {
        Flight flight1 = new Flight("Warsaw", "Moscow");
        Flight flight2 = new Flight("Berlin", "Kiev");
        Flight flight3 = new Flight("London", "Warsaw");
        Flight flight4 = new Flight("Praha", "Berlin");
        Flight flight5 = new Flight("Tallin", "Warsaw");
        Flight flight6 = new Flight("Rome", "Lisbon");

        FlightFinder flightFinder = new FlightFinder();
        flightFinder.addFlight(flight1);
        flightFinder.addFlight(flight2);
        flightFinder.addFlight(flight3);
        flightFinder.addFlight(flight4);
        flightFinder.addFlight(flight5);
        flightFinder.addFlight(flight6);

        try {
            boolean checkFlight = flightFinder.findFlight("London");
            System.out.println("The arrivalAirport exists.");
        }
        catch (RouteNotFoundException e) {
            System.out.println("RouteNotFoundException: The arrivalAirport not exists.");
        }


    }
}
