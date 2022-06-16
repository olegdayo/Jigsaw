package com.example.jigsaw.figures;

import javafx.scene.paint.Color;

/**
 * The type N left.
 */
public class NLeft extends Figure {
    /**
     * Instantiates a new N left.
     *
     * @param color the color
     */
    NLeft(Color color) {
        super(color);
        points = new Point[4];
        points[0] = new Point(1, 0);
        points[1] = new Point(2, 0);
        points[2] = new Point(0, 1);
        points[3] = new Point(1, 1);
    }
}
