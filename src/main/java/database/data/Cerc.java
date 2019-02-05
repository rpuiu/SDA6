package database.data;

import poly.FormaGeometrica;

public class Cerc extends FormaGeometrica {
    public int getRadius() {
        return radius;
    }

    private int radius;
    static final double PI = Math.PI;

    public Cerc(int radius) {
        this.radius = radius;
    }

    @Override
    public double calcArie() {
        return Math.pow(radius, 2) * PI;
    }

}
