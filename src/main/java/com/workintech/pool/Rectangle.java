package com.workintech.pool;

public class Rectangle {
    private double width;
    private double length;

    // Default Constructor
    public Rectangle() {
        this.width = 0; // Default olarak 0 atanıyor
        this.length = 0; // Default olarak 0 atanıyor
    }

    // Parametreli Constructor
    public Rectangle(double width, double length) {
        this.width = Math.max(width, 0); // width 0'dan küçükse 0 atanır
        this.length = Math.max(length, 0); // length 0'dan küçükse 0 atanır
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Getter for length
    public double getLength() {
        return length;
    }

    // Method to calculate area
    public double getArea() {
        return this.width * this.length;
    }
}