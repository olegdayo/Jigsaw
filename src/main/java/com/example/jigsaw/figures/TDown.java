package com.example.jigsaw.figures;

import javafx.scene.paint.Color;

/**
 * The type T down.
 */
public class TDown extends Figure {
    /**
     * Instantiates a new T down.
     *
     * @param color the color
     */
    TDown(Color color) {
        super(color);
        points = new Point[5];
        points[0] = new Point(1, 0);
        points[1] = new Point(1, 1);
        points[2] = new Point(0, 2);
        points[3] = new Point(1, 2);
        points[4] = new Point(2, 2);
    }
}
