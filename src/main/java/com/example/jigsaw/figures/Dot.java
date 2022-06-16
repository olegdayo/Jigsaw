package com.example.jigsaw.figures;

import javafx.scene.paint.Color;

/**
 * The type Dot.
 */
public class Dot extends Figure {
    /**
     * Instantiates a new Dot.
     *
     * @param color the color
     */
    Dot(Color color) {
        super(color);
        points = new Point[1];
        points[0] = new Point(0, 0);
    }
}
