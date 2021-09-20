package com.example;

public class CirclePath extends Path {
    private double radius;

    public CirclePath(double radius) {
        this.radius = radius;
    }

    @Override
    public double distance() {
        return  2.0 * radius * Math.PI; /* Circumference */
    }
}
