package com.example.jigsaw;

import javafx.scene.paint.Color;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CellTest {

    @Test
    void getX() {
        int x = 10;
        int y = 20;
        Cell cell = new Cell(x, y);
        assertEquals(x, cell.getX());
    }

    @Test
    void getY() {
        int x = 10;
        int y = 20;
        Cell cell = new Cell(x, y);
        assertEquals(y, cell.getY());
    }

    @Test
    void getBackground() {
        int x = 10;
        int y = 20;
        Cell cell = new Cell(x, y);
        assertEquals(Color.TRANSPARENT, cell.getBackground());

        cell = new Cell(x, y, Color.RED);
        assertEquals(Color.RED, cell.getBackground());
    }

    @Test
    void setBackground() {
        int x = 10;
        int y = 20;
        Cell cell = new Cell(x, y);
        cell.setBackground(Color.RED);
        assertEquals(Color.RED, cell.getBackground());
    }
}