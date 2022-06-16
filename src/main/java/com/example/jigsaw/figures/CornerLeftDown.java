package com.example.jigsaw.figures;

import javafx.scene.paint.Color;

/**
 * The type Corner left down.
 */
public class CornerLeftDown extends Figure {

    /**
     * Instantiates a new Corner left down.
     *
     * @param color the color
     */
    CornerLeftDown(Color color) {
        super(color);
        points = new Point[5];
        points[0] = new Point(0, 0);
        points[1] = new Point(0, 1);
        points[2] = new Point(0, 2);
        points[3] = new Point(1, 2);
        points[4] = new Point(2, 2);
    }
}
