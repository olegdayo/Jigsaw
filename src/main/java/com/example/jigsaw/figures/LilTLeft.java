package com.example.jigsaw.figures;

import javafx.scene.paint.Color;

/**
 * The type Lil t left.
 */
public class LilTLeft extends Figure {
    /**
     * Instantiates a new Lil t left.
     *
     * @param color the color
     */
    LilTLeft(Color color) {
        super(color);
        points = new Point[4];
        points[0] = new Point(0, 0);
        points[1] = new Point(0, 1);
        points[2] = new Point(0, 2);
        points[3] = new Point(1, 1);
    }
}
