package com.example.jigsaw.figures;

import javafx.scene.paint.Color;

/**
 * The type Lil t up.
 */
public class LilTUp extends Figure {
    /**
     * Instantiates a new Lil t up.
     *
     * @param color the color
     */
    LilTUp(Color color) {
        super(color);
        points = new Point[4];
        points[0] = new Point(0, 0);
        points[1] = new Point(1, 0);
        points[2] = new Point(2, 0);
        points[3] = new Point(1, 1);
    }
}
