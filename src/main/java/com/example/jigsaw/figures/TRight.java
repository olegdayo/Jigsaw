package com.example.jigsaw.figures;

import javafx.scene.paint.Color;

/**
 * The type T right.
 */
public class TRight extends Figure {
    /**
     * Instantiates a new T right.
     *
     * @param color the color
     */
    TRight(Color color) {
        super(color);
        points = new Point[5];
        points[0] = new Point(2, 0);
        points[1] = new Point(0, 1);
        points[2] = new Point(1, 1);
        points[3] = new Point(2, 1);
        points[4] = new Point(2, 2);
    }
}
