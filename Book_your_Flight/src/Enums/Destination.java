package Enums;

public enum Destination {
    CANCUN(1600), GUADALAJARA(550), MONTERREY(900), TULUM(1500), 
    LOSANGELES(2500), NEWYORK(4000), LONDON(8900);

    private final float distance;

    Destination(float distance) {
        this.distance = distance;
    }

    public float getDistance() {
        return distance;
    }
}