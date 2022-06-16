package com.example.jigsaw.figures;

import javafx.scene.paint.Color;

/**
 * The type J left.
 */
public class JLeft extends Figure {
    /**
     * Instantiates a new J left.
     *
     * @param color the color
     */
    JLeft(Color color) {
        super(color);
        points = new Point[4];
        points[0] = new Point(0, 0);
        points[1] = new Point(1, 0);
        points[2] = new Point(2, 0);
        points[3] = new Point(0, 1);
    }
}
