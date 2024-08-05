package Flights;

import Enums.Destination;

class InternationalFlight extends Flight {
    public InternationalFlight(String id, Destination destination) {
        super(id, destination, (float) (1000 + Math.random() * 1000));
    }

    @Override
    protected float calculateLuggageAllowance() {
        return price * 0.2f;
    }

    @Override
    protected String[][] createSeatMap() {
        String[][] map = new String[28][2];
        for (int i = 0; i < 28; i++) {
            map[i][0] = "A |" + (i + 1) + "OOO| " + (i + 1) + "OOO| " + (i + 1) + "OOO|";
            map[i][1] = " |123| |456| |789|";
        }
        return map;
    }
}