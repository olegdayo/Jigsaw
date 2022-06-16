package com.example.jigsaw.figures;

import javafx.scene.paint.Color;

/**
 * The type G right.
 */
public class GRight extends Figure {
    /**
     * Instantiates a new G right.
     *
     * @param color the color
     */
    GRight(Color color) {
        super(color);
        points = new Point[4];
        points[0] = new Point(0, 0);
        points[1] = new Point(1, 0);
        points[2] = new Point(2, 0);
        points[3] = new Point(2, 1);
    }
}
