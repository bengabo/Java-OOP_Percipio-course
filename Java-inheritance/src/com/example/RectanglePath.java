package com.example;

public class RectanglePath extends Path {
    private double width, height;

    public RectanglePath(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double distance(){
        return 2.0 * (width + height);
    }
}
