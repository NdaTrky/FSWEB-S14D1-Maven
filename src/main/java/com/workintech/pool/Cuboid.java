package com.workintech.pool;

public class Cuboid extends Rectangle {
    private double height;

    // Constructor
    public Cuboid(double width, double length, double height) {
        super(width, length); // Rectangle constructor'ını çağırıyoruz
        this.height = Math.max(height, 0); // 0'dan küçükse 0 atanır
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Method to calculate volume
    public double getVolume() {
        return super.getArea() * this.getHeight(); // Hacim alan * yükseklik
    }
}