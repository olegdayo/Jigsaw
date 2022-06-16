package com.example.jigsaw;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * The type Cell.
 * Basic part of filed and figure.
 */
public class Cell {
    /**
     * The background color.
     */
    Color background;
    /**
     * The edge color.
     */
    Color edge;
    /**
     * The x-position.
     */
    int x;
    /**
     * The y-position.
     */
    int y;
    /**
     * The rectangle drawable figure.
     */
    Rectangle rect;
    /**
     * The constant SIDE length of each cell.
     */
    public static final int SIDE = 48;

    /**
     * Instantiates a new Cell.
     * @param x the x-position.
     * @param y the y-position.
     */
    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        background = Color.TRANSPARENT;
        edge = Color.GOLD;
        rect = new Rectangle(SIDE, SIDE);
        rect.setFill(background);
        rect.setStroke(edge);
        rect.setStrokeWidth(2);
        rect.setX(this.x);
        rect.setY(this.y);
    }

    /**
     * Instantiates a new Cell.
     * @param x     the x-position.
     * @param y     the y-position.
     * @param color the custom color in the background.
     */
    public Cell(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        background = color;
        edge = Color.BLACK;
        rect = new Rectangle(SIDE, SIDE);
        rect.setFill(background);
        rect.setStroke(edge);
        rect.setX(this.x);
        rect.setY(this.y);
    }

    /**
     * Gives x-position.
     * @return the x-position.
     */
    public int getX() {
        return x;
    }

    /**
     * Gives y-position.
     * @return the y-position.
     */
    public int getY() {
        return y;
    }

    /**
     * Gets background color.
     * @return the background color.
     */
    public Color getBackground() {
        return background;
    }

    /**
     * Sets background color.
     * @param background the background color.
     */
    public void setBackground(Color background) {
        this.background = background;
        rect.setFill(background);
    }
}
