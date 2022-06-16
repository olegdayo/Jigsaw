package com.example.jigsaw.figures;

import javafx.scene.paint.Color;

/**
 * The type J up.
 */
public class JUp extends Figure {
    /**
     * Instantiates a new J up.
     *
     * @param color the color
     */
    JUp(Color color) {
        super(color);
        points = new Point[4];
        points[0] = new Point(0, 0);
        points[1] = new Point(1, 0);
        points[2] = new Point(1, 1);
        points[3] = new Point(1, 2);
    }
}
