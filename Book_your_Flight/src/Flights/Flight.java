package Flights;

import Enums.Destination;

abstract class Flight {
    protected String id;
    protected Destination destination;
    protected float price;
    protected float luggageAllowance;
    protected String[][] seatMap;

    public Flight(String id, Destination destination, float price) {
        this.id = id;
        this.destination = destination;
        this.price = price;
        this.luggageAllowance = calculateLuggageAllowance();
        this.seatMap = createSeatMap();
    }

    protected abstract float calculateLuggageAllowance();

    protected abstract String[][] createSeatMap();

    public String getId() {
        return id;
    }

    public Destination getDestination() {
        return destination;
    }

    public float getPrice() {
        return price;
    }

    public float getLuggageAllowance() {
        return luggageAllowance;
    }

    public String[][] getSeatMap() {
        return seatMap;
    }
}