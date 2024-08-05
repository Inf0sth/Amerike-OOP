package Flights;

import Enums.Destination;

class DomesticFlight extends Flight {
    public DomesticFlight(String id, Destination destination) {
        super(id, destination, (float) (300 + Math.random() * 200));
    }

    @Override
    protected float calculateLuggageAllowance() {
        return price * 0.1f;
    }

    @Override
    protected String[][] createSeatMap() {
        String[][] map = new String[28][2];
        for (int i = 0; i < 28; i++) {
            map[i][0] = "A |" + (i + 1) + "OOO| " + (i + 1) + "OOO|";
            map[i][1] = " |123| |456|";
        }
        return map;
    }
}