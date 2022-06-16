package com.example.jigsaw;

/**
 * The field itself.
 */
public class Field {
    /**
     * The matrix with cells.
     */
    Cell[][] matrix;
    /**
     * The x-position.
     */
    int x;
    /**
     * The y-position.
     */
    int y;
    /**
     * The constant MATRIX_SIDE which shows how many cells on side.
     */
    public static final int MATRIX_SIDE = 9;

    /**
     * Instantiates a new Field.
     * @param x the x-position.
     * @param y the y-position.
     */
    Field(int x, int y) {
        this.x = x;
        this.y = y;
        matrix = new Cell[MATRIX_SIDE][MATRIX_SIDE];
        initializeMatrix();
    }

    /**
     * Initialize matrix: fills it with cells.
     */
    void initializeMatrix() {
        for (int i = 0; i < MATRIX_SIDE; ++i) {
            for (int j = 0; j < MATRIX_SIDE; ++j) {
                matrix[i][j] = new Cell(x + Cell.SIDE * i + (2 * i + 2), y + Cell.SIDE * j + (2 * j + 2));
            }
        }
    }

    /**
     * Gives the cell matrix.
     * @return the cell matrix.
     */
    public Cell[][] getMatrix() {
        return matrix;
    }
}
