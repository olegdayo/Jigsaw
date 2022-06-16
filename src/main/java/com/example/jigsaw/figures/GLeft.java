package com.example.jigsaw.figures;

import javafx.scene.paint.Color;

/**
 * The type G left.
 */
public class GLeft extends Figure {
    /**
     * Instantiates a new G left.
     *
     * @param color the color
     */
    GLeft(Color color) {
        super(color);
        points = new Point[4];
        points[0] = new Point(0, 0);
        points[1] = new Point(0, 1);
        points[2] = new Point(1, 1);
        points[3] = new Point(2, 1);
    }
}
