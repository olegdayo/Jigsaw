package com.example.jigsaw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FieldTest {

    @Test
    void initializeMatrix() {
        Field field = new Field(0, 0);
        Cell[][] cells = new Cell[9][9];
        for (int i = 0; i < Field.MATRIX_SIDE; ++i) {
            for (int j = 0; j < Field.MATRIX_SIDE; ++j) {
                cells[i][j] = new Cell(Cell.SIDE * i + (2 * i + 2), Cell.SIDE * j + (2 * j + 2));
                assertEquals(cells[i][j].getX(), field.getMatrix()[i][j].getX());
                assertEquals(cells[i][j].getY(), field.getMatrix()[i][j].getY());
                assertEquals(cells[i][j].getBackground(), field.getMatrix()[i][j].getBackground());
            }
        }
    }

    @Test
    void getMatrix() {
        Field field = new Field(0, 0);
        Cell[][] cells = new Cell[9][9];
        for (int i = 0; i < Field.MATRIX_SIDE; ++i) {
            for (int j = 0; j < Field.MATRIX_SIDE; ++j) {
                cells[i][j] = new Cell(Cell.SIDE * i + (2 * i + 2), Cell.SIDE * j + (2 * j + 2));
                assertEquals(cells[i][j].getX(), field.getMatrix()[i][j].getX());
                assertEquals(cells[i][j].getY(), field.getMatrix()[i][j].getY());
                assertEquals(cells[i][j].getBackground(), field.getMatrix()[i][j].getBackground());
            }
        }
    }
}