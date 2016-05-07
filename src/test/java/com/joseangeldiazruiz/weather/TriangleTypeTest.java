package com.joseangeldiazruiz.weather;

import org.junit.Test;

import static org.junit.Assert.*;


public class TriangleTypeTest {

    int a = 1;
    int b = 2;
    int c = 3;

    @Test
    public void fromSides_scalene() throws Exception {
        assertEquals(TriangleType.SCALENE, TriangleType.fromSides(a,b,c));
    }

    @Test
    public void fromSides_equilateral() throws Exception {
        assertEquals(TriangleType.EQUILATERAL, TriangleType.fromSides(a,a,a));
    }

    @Test
    public void fromSides_isosceles() throws Exception {
        assertEquals(TriangleType.ISOSCELES, TriangleType.fromSides(a,a,c));
        assertEquals(TriangleType.ISOSCELES, TriangleType.fromSides(a,b,b));
        assertEquals(TriangleType.ISOSCELES, TriangleType.fromSides(c,b,c));

    }

    @Test(expected = IllegalArgumentException.class)
    public void fromSides_notTriangle() throws Exception {
        TriangleType.fromSides(a,a,0);
    }



}