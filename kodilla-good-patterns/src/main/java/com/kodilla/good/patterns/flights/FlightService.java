package com.kodilla.good.patterns.flights;

import java.util.*;
import java.util.stream.Collectors;

public class FlightService {
    private final Set<Flight> flightConnections = new HashSet<>();

    public FlightService() {
        flightConnections.add(new Flight("Warsaw", "London"));
        flightConnections.add(new Flight("Warsaw", "Frankfurt"));
        flightConnections.add(new Flight("Warsaw", "Milan"));

        flightConnections.add(new Flight("London", "Paris"));
        flightConnections.add(new Flight("London", "Dublin"));
        flightConnections.add(new Flight("London", "Malaga"));

        flightConnections.add(new Flight("Frankfurt", "Bratislava"));
        flightConnections.add(new Flight("Milan", "Barcelona"));
    }

    public Set<Flight> findFlightFromViaTo(String departureAirport, String viaAirport, String arrivalAirport) {

        Flight flightFrom = flightConnections.stream()
                .filter(f -> f.getDepartureAirport().equals(departureAirport))
                .filter(f -> f.getArrivalAirport().equals(viaAirport))
                .findFirst().get();

        Flight flightTo = flightConnections.stream()
                .filter(f -> f.getDepartureAirport().equals(viaAirport))
                .filter(f -> f.getArrivalAirport().equals(arrivalAirport))
                .findFirst().get();

        HashSet<Flight> flights = new HashSet<>();
        flights.add(flightFrom);
        flights.add(flightTo);

        return flights;
    }

    public Set<Flight> findFlightsFrom(String fromCity) {
        return flightConnections.stream()
                .filter(f -> f.getDepartureAirport().equals(fromCity))
                .collect(Collectors.toSet());
    }
    public Set<Flight> findFlightsTo(String toCity) {
        return flightConnections.stream()
                .filter(f -> f.getArrivalAirport().equals(toCity))
                .collect(Collectors.toSet());
    }
}