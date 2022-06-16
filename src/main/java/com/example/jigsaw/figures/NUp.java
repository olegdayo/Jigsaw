package com.example.jigsaw.figures;

import javafx.scene.paint.Color;

/**
 * The type N up.
 */
public class NUp extends Figure {
    /**
     * Instantiates a new N up.
     *
     * @param color the color
     */
    NUp(Color color) {
        super(color);
        points = new Point[4];
        points[0] = new Point(0, 0);
        points[1] = new Point(0, 1);
        points[2] = new Point(1, 1);
        points[3] = new Point(1, 2);
    }
}
