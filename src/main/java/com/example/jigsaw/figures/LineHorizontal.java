package com.example.jigsaw.figures;

import javafx.scene.paint.Color;

/**
 * The type Line horizontal.
 */
public class LineHorizontal extends Figure {
    /**
     * Instantiates a new Line horizontal.
     *
     * @param color the color
     */
    LineHorizontal(Color color) {
        super(color);
        points = new Point[3];
        points[0] = new Point(0, 0);
        points[1] = new Point(1, 0);
        points[2] = new Point(2, 0);
    }
}
