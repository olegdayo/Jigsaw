package com.example.jigsaw.figures;

import javafx.scene.paint.Color;

/**
 * The type Corner left up.
 */
public class CornerLeftUp extends Figure {
    /**
     * Instantiates a new Corner left up.
     *
     * @param color the color
     */
    CornerLeftUp(Color color) {
        super(color);
        points = new Point[5];
        points[0] = new Point(0, 0);
        points[1] = new Point(1, 0);
        points[2] = new Point(2, 0);
        points[3] = new Point(0, 1);
        points[4] = new Point(0, 2);
    }
}
