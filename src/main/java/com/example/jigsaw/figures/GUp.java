package com.example.jigsaw.figures;

import javafx.scene.paint.Color;

/**
 * The type G up.
 */
public class GUp extends Figure {
    /**
     * Instantiates a new G up.
     *
     * @param color the color
     */
    GUp(Color color) {
        super(color);
        points = new Point[4];
        points[0] = new Point(0, 0);
        points[1] = new Point(1, 0);
        points[2] = new Point(0, 1);
        points[3] = new Point(0, 2);
    }
}
