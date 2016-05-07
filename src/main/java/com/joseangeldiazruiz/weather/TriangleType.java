package com.joseangeldiazruiz.weather;

public enum TriangleType {
    EQUILATERAL,
    ISOSCELES,
    SCALENE;

    static TriangleType fromSides(int a, int b, int c) {
        if (a < 1 || b < 1 || c < 1) {
            throw new IllegalArgumentException("All triangle sides must be greater than 0");
        }

        if (a == b && b == c) {
            return EQUILATERAL;
        }

        if (a == c || a == b || b == c ) {
            return ISOSCELES;
        }

        return SCALENE;
    }

}
