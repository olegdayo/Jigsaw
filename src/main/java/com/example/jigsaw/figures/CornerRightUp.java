package com.example.jigsaw.figures;

import javafx.scene.paint.Color;

/**
 * The type Corner right up.
 */
public class CornerRightUp extends Figure {
    /**
     * Instantiates a new Corner right up.
     *
     * @param color the color
     */
    CornerRightUp(Color color) {
        super(color);
        points = new Point[5];
        points[0] = new Point(0, 0);
        points[1] = new Point(1, 0);
        points[2] = new Point(2, 0);
        points[3] = new Point(2, 1);
        points[4] = new Point(2, 2);
    }
}
