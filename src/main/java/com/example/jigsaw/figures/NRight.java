package com.example.jigsaw.figures;

import javafx.scene.paint.Color;

/**
 * The type N right.
 */
public class NRight extends Figure {
    /**
     * Instantiates a new N right.
     *
     * @param color the color
     */
    NRight(Color color) {
        super(color);
        points = new Point[4];
        points[0] = new Point(0, 0);
        points[1] = new Point(1, 0);
        points[2] = new Point(1, 1);
        points[3] = new Point(2, 1);
    }
}
