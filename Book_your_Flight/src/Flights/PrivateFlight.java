package Flights;

import Enums.Destination;

class PrivateFlight extends Flight {
    public PrivateFlight(String id, Destination destination) {
        super(id, destination, (float) (3000 + Math.random() * 2000));
    }

    @Override
    protected float calculateLuggageAllowance() {
        return price * 0.25f;
    }

    @Override
    protected String[][] createSeatMap() {
        String[][] map = new String[28][2];
        for (int i = 0; i < 28; i++) {
            map[i][0] = "A |" + (i + 1) + "OO| " + (i + 1) + "OO|";
            map[i][1] = " |12| |34|";
        }
        return map;
    }
}