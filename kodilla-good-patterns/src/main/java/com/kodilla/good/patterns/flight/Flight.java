package com.kodilla.good.patterns.flight;

import java.time.LocalDate;
import java.time.LocalTime;

public class Flight {
    private String flightNumber;
    private String departureAirport;
    private String transferAirport;
    private String arrivalAirport;
    private LocalTime departureTime;

    public Flight(String flightNumber, String departureAirport, String transferAirport, String arrivalAirport, LocalTime departureTime) {
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.transferAirport = transferAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getTransferAirport() {
        return transferAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    @Override
    public String toString() {
        return "Flight number: " + this.getFlightNumber() +
                ", Departure Airport: " + this.getDepartureAirport() +
                ", Transfer Airport: " + this.getTransferAirport() +
                ", Arrival Airport: " + this.getArrivalAirport() +
                ", Departure Time: " + this.getDepartureTime();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        return flightNumber != null ? flightNumber.equals(flight.flightNumber) : flight.flightNumber == null;
    }

    @Override
    public int hashCode() {
        return flightNumber != null ? flightNumber.hashCode() : 0;
    }
}
