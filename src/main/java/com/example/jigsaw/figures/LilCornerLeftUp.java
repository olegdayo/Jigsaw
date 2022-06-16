package com.example.jigsaw.figures;

import javafx.scene.paint.Color;

/**
 * The type Lil corner left up.
 */
public class LilCornerLeftUp extends Figure {
    /**
     * Instantiates a new Lil corner left up.
     *
     * @param color the color
     */
    LilCornerLeftUp(Color color) {
        super(color);
        points = new Point[3];
        points[0] = new Point(0, 0);
        points[1] = new Point(1, 0);
        points[2] = new Point(0, 1);
    }
}
