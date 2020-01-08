package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightScanner {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("LHR", true);
        airports.put("WAW", true);
        airports.put("KRK", false);
        airports.put("JFK", true);
        airports.put("LAX", true);

        if(airports.containsKey(flight.getArrivalAirport())) {
            return airports.get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException("Airport doesn't exist");
        }
    }
}