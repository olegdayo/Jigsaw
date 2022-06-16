package com.example.jigsaw.figures;

import javafx.scene.paint.Color;

/**
 * The type Line vertical.
 */
public class LineVertical extends Figure {
    /**
     * Instantiates a new Line vertical.
     *
     * @param color the color
     */
    LineVertical(Color color) {
        super(color);
        points = new Point[3];
        points[0] = new Point(0, 0);
        points[1] = new Point(0, 1);
        points[2] = new Point(0, 2);
    }
}
