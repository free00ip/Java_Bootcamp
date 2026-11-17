package org.example.day3.abstractClasses;

public class Circle extends Shape {

    final double p = 3.14;

    // TODO: Implement calculateArea and calculatePerimeter methods

    public double calculateArea(double length, double breadth, double radius) {
        return p * radius * radius;
    }
    public double calculatePerimeter(double length, double breadth, double radius) {
        return 2 * p * radius;
    }

}
