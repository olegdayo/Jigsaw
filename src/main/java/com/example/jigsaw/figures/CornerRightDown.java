package com.example.jigsaw.figures;

import javafx.scene.paint.Color;

/**
 * The type Corner right down.
 */
public class CornerRightDown extends Figure {
    /**
     * Instantiates a new Corner right down.
     *
     * @param color the color
     */
    CornerRightDown(Color color) {
        super(color);
        points = new Point[5];
        points[0] = new Point(0, 2);
        points[1] = new Point(1, 2);
        points[2] = new Point(2, 0);
        points[3] = new Point(2, 1);
        points[4] = new Point(2, 2);
    }
}
