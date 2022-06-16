package com.example.jigsaw.figures;

import javafx.scene.paint.Color;

/**
 * The type Lil corner right up.
 */
public class LilCornerRightUp extends Figure {
    /**
     * Instantiates a new Lil corner right up.
     *
     * @param color the color
     */
    LilCornerRightUp(Color color) {
        super(color);
        points = new Point[3];
        // . .
        //   .
        points[0] = new Point(0, 0);
        points[1] = new Point(1, 0);
        points[2] = new Point(1, 1);
    }
}
