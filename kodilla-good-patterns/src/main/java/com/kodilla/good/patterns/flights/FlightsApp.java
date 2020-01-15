package com.kodilla.good.patterns.flights;

import java.util.Set;

public class FlightsApp {
    public static void main(String[] args) {
        FlightService flightsService = new FlightService();

        Set<Flight> fromLondon = flightsService.findFlightsFrom("London");
        System.out.println("Flights from: " + fromLondon);

        Set<Flight> toBarcelona = flightsService.findFlightsTo("Barcelona");
        System.out.println("Flights to: " + toBarcelona);

        Set<Flight> fromWarsawViaLondonToParis = flightsService.findFlightFromViaTo("Warsaw", "London", "Paris");
        System.out.println("Flights through: " + fromWarsawViaLondonToParis);

    }
}