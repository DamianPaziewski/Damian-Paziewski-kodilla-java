package com.kodilla.exception.test;

public class FlightApplication {
    public static void main(String[] args) {
        Flight flight1 = new Flight("LHR", "WAW");
        Flight flight2 = new Flight("KRK", "LAX");
        Flight flight3 = new Flight("JFK", "POZ");

        FlightScanner flightScanner = new FlightScanner();

        try {
            System.out.println(flightScanner.findFlight(flight1));
        } catch (RouteNotFoundException e) {
            System.out.println("Please input correct airport name.");
        }

        try {
            System.out.println(flightScanner.findFlight(flight2));
        } catch (RouteNotFoundException e) {
            System.out.println("Please input correct airport name.");
        }

        try {
            System.out.println(flightScanner.findFlight(flight3));
        } catch (RouteNotFoundException e) {
            System.out.println("Please input correct airport name.");
        }
    }
}