package com.flights.flight.pojo;

import java.util.List;

public class BothWaysFlight {

    private List<Flight> destinationFlights;
    private List<Flight> returningFlights;

    public BothWaysFlight() {
    }

    public BothWaysFlight(List<Flight> destinationFlights, List<Flight> returningFlights) {
        this.destinationFlights = destinationFlights;
        this.returningFlights = returningFlights;
    }

    public List<Flight> getDestinationFlights() {
        return destinationFlights;
    }

    public void setDestinationFlights(List<Flight> destinationFlights) {
        this.destinationFlights = destinationFlights;
    }

    public List<Flight> getReturningFlights() {
        return returningFlights;
    }

    public void setReturningFlights(List<Flight> returningFlights) {
        this.returningFlights = returningFlights;
    }
}
