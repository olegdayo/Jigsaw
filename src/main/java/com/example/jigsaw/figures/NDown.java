package com.example.jigsaw.figures;

import javafx.scene.paint.Color;

/**
 * The type N down.
 */
public class NDown extends Figure {
    /**
     * Instantiates a new N down.
     *
     * @param color the color
     */
    NDown(Color color) {
        super(color);
        points = new Point[4];
        points[0] = new Point(1, 0);
        points[1] = new Point(0, 1);
        points[2] = new Point(1, 1);
        points[3] = new Point(0, 2);
    }
}
