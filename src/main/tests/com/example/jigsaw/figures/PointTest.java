package com.example.jigsaw.figures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void getX() {
        int x = 10;
        int y = 20;
        Point point = new Point(x, y);
        assertEquals(x, point.x);
    }

    @Test
    void getY() {
        int x = 10;
        int y = 20;
        Point point = new Point(x, y);
        assertEquals(y, point.y);
    }
}